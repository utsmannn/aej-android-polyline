package com.utsman.mapspolyline

import android.annotation.SuppressLint
import android.content.Context
import android.location.Location
import android.os.Looper
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.Priority
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.distinctUntilChanged

class LocationManager(private val context: Context) {

    private val locationRequest: LocationRequest by lazy {
        LocationRequest.create().apply {
            priority = Priority.PRIORITY_HIGH_ACCURACY
            interval = 1000
        }
    }

    private val distanceValidator = 30f

    private val fusedProviderClient: FusedLocationProviderClient by lazy {
        LocationServices.getFusedLocationProviderClient(context)
    }

    @SuppressLint("MissingPermission")
    suspend fun getLocation(): Flow<Location> {
        val callbackFlow = callbackFlow<Location> {
            val locationCallback = object : LocationCallback() {
                override fun onLocationResult(result: LocationResult) {
                    for (location in result.locations) {
                        trySend(location).isSuccess
                    }
                }
            }

            fusedProviderClient.requestLocationUpdates(
                locationRequest, locationCallback, Looper.getMainLooper()
            ).addOnCanceledListener {
                cancel("Cancel request", Throwable("Canceled by user"))
            }.addOnFailureListener {
                cancel("Failure get location", it)
            }

            awaitClose { fusedProviderClient.removeLocationUpdates(locationCallback) }
        }

        return callbackFlow.distinctUntilChanged { old, new ->
            old.distanceTo(new) < distanceValidator
        }
    }
}