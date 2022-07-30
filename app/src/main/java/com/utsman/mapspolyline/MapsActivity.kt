package com.utsman.mapspolyline

import android.Manifest
import android.graphics.Color
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions
import com.google.maps.android.PolyUtil
import com.utsman.mapspolyline.databinding.ActivityMapsBinding
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import pub.devrel.easypermissions.AfterPermissionGranted
import pub.devrel.easypermissions.EasyPermissions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    companion object {
        private const val LOCATION_PERMISSION = 12
    }

    private val locationManager: LocationManager by lazy {
        LocationManager(this)
    }

    private val markerManager: MarkerManager by lazy {
        MarkerManager()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        getLocation()
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.uiSettings.isCompassEnabled = true
        mMap.uiSettings.isZoomControlsEnabled = true

        val routes = Sources.getResultRoutes()
        val coordinates = routes.data?.route.orEmpty()
            .map {
                LatLng(it?.latitude ?: 0.0, it?.longitude ?: 0.0)
            }

        val point1 = coordinates.firstOrNull()
        point1?.let {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(it, 14f))
        }

        val polyline = PolylineOptions()
            .addAll(coordinates)
            .width(6f)
            .color(Color.RED)
        mMap.addPolyline(polyline)

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this)
    }

    @AfterPermissionGranted(LOCATION_PERMISSION)
    private fun getLocation() {
        val locationPermission = Manifest.permission.ACCESS_FINE_LOCATION
        if (EasyPermissions.hasPermissions(this, locationPermission)) {
            MainScope().launch {
                locationManager.getLocation().collect(onLocationResult())
            }
        } else {
            EasyPermissions.requestPermissions(
                this,
                "This app need location permission",
                LOCATION_PERMISSION,
                locationPermission
            )
        }
    }

    private lateinit var marker: Marker

    private fun onLocationResult() = FlowCollector<Location> { location ->
        println("location result -> ${location.latitude} - ${location.longitude}")
        val newLatLng = LatLng(location.latitude, location.longitude)
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(newLatLng, 17f))

        if (!this::marker.isInitialized) {
            val markerOption = MarkerOptions()
                .position(newLatLng)
            mMap.addMarker(markerOption)?.let {
                marker = it
            }
        } else {
            markerManager.moveMarkerSmoothly(marker, newLatLng)
        }
    }
}