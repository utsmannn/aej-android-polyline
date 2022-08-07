package com.utsman.mapspolyline

import android.animation.ValueAnimator
import android.location.Location
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker

fun Location.toLatLng(): LatLng {
    return LatLng(latitude, longitude)
}

fun LatLng.toLocation(): Location {
    val location = Location("").also {
        it.latitude = latitude
        it.longitude = longitude
    }
    return location
}

fun Marker.moveSmoothly(newLatLng: LatLng) {
    val animator = ValueAnimator.ofFloat(0f, 100f)
    val deltaLat = doubleArrayOf(newLatLng.latitude - this.position.latitude)
    val deltaLon = newLatLng.longitude - this.position.longitude
    val prevStep = floatArrayOf(0f)
    animator.duration = 1000

    animator.addUpdateListener { animation ->
        val currentValue = animation.animatedValue as Float
        val deltaStep = (currentValue - prevStep[0]).toDouble()
        prevStep[0] = currentValue

        val updatedLat = this.position.latitude + deltaLat[0] * deltaStep * 1.0 / 100
        val updatedLon = this.position.longitude + deltaStep * deltaLon * 1.0 / 100
        val updatedLatLng = LatLng(updatedLat, updatedLon)

        this.position = updatedLatLng
    }

    animator.start()
}

