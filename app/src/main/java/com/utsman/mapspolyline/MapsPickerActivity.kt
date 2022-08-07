package com.utsman.mapspolyline

import android.annotation.SuppressLint
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.utsman.mapspolyline.databinding.ActivityPickerMapsBinding
import com.utsman.mapspolyline.entity.LocationData
import com.utsman.mapspolyline.manager.LocationManager
import com.utsman.mapspolyline.network.ResponseMapper
import com.utsman.mapspolyline.network.WebServices
import com.utsman.mapspolyline.utils.BaseActivityBinding
import com.utsman.mapspolyline.utils.toast
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

class MapsPickerActivity : BaseActivityBinding<ActivityPickerMapsBinding>() {

    private var isPanelShow = false

    private val locationManager by lazy { LocationManager(this) }

    private val webServices: WebServices by lazy {
        WebServices.create()
    }



    override fun inflateBinding(): ActivityPickerMapsBinding {
        return ActivityPickerMapsBinding.inflate(layoutInflater)
    }

    override fun onCreateBinding(savedInstanceState: Bundle?) {
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(onMapReady())

        hidePanel()
    }

    private fun onMapReady(): OnMapReadyCallback = OnMapReadyCallback { map ->
        map.uiSettings.isCompassEnabled = true
        map.uiSettings.isZoomControlsEnabled = true

        locationManager.getLastLocation { location ->
            val latLng = location.toLatLng()
            map.animateCamera(
                CameraUpdateFactory.newLatLngZoom(latLng, 12f)
            )
        }

        map.setOnCameraMoveListener {
            println("move.....")
            hidePanel()
        }

        map.setOnCameraIdleListener {
            println("idle ... -> ${map.cameraPosition.target}")
            runBlocking {
                val coordinate = map.cameraPosition.target
                println("loading.......")
                map.uiSettings.isScrollGesturesEnabled = false
                getReverseLocationFlow(coordinate)
                    .debounce(1000L)
                    .collect {
                        println("result -> ${it.name}")
                        onLocationResult(it)
                        map.uiSettings.isScrollGesturesEnabled = true
                    }
            }
        }
    }

    private fun onLocationResult(locationData: LocationData) {
        showPanel()
        with(binding) {
            val result = "${locationData.name}\n${locationData.address.country}"
            tvLocationResult.text = result
        }
    }

    private fun hidePanel() {
        isPanelShow = false
        with(binding) {
            panelLocation.animate()
                .translationY(400f)
                .start()
        }
    }

    private fun showPanel() {
        isPanelShow = true
        with(binding) {
            panelLocation.animate()
                .translationY(0f)
                .start()
        }
    }

    private fun getReverseLocationFlow(
        latLng: LatLng
    ): Flow<LocationData> {
        return flow {
            val coordinateString = "${latLng.latitude},${latLng.longitude}"
            val response = webServices.reserveCoordinate(coordinateString)
            if (response.isSuccessful) {
                val data = ResponseMapper.mapReserveLocationResponseToLocation(response.body())
                emit(data)
            } else {
                toast("error: ${response.message()}")
            }
        }
    }

    private fun togglePanel() {
        if (isPanelShow) {
            hidePanel()
        } else {
            showPanel()
        }
    }
}