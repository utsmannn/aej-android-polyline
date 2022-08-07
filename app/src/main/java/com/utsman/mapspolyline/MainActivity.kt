package com.utsman.mapspolyline

import android.Manifest
import android.os.Bundle
import android.widget.Toast
import com.utsman.mapspolyline.databinding.ActivityMainBinding
import com.utsman.mapspolyline.manager.LocationManager
import com.utsman.mapspolyline.utils.BaseActivityBinding
import com.utsman.mapspolyline.utils.intentTo
import pub.devrel.easypermissions.AfterPermissionGranted
import pub.devrel.easypermissions.EasyPermissions

class MainActivity : BaseActivityBinding<ActivityMainBinding>() {

    companion object {
        private const val RC_LOCATION = 16
    }

    private val locationManager: LocationManager by lazy {
        LocationManager(this)
    }

    override fun inflateBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    @AfterPermissionGranted(value = RC_LOCATION)
    override fun onCreateBinding(savedInstanceState: Bundle?) {
        // coding

        getPermission {
            with(binding) {
                btnMaps.setOnClickListener {
                    intentTo(MapsActivity::class.java)
                }

                btnUser.setOnClickListener {
                    intentTo(UserActivity::class.java)
                }

                btnPickerMaps.setOnClickListener {
                    intentTo(MapsPickerActivity::class.java)
                }
            }
        }

    }

    private fun getPermission(onResult: () -> Unit) {
        val fineLocation = Manifest.permission.ACCESS_FINE_LOCATION
        val coarseLocation = Manifest.permission.ACCESS_COARSE_LOCATION
        if (EasyPermissions.hasPermissions(this, fineLocation, coarseLocation)) {
            Toast.makeText(this, "granted", Toast.LENGTH_SHORT).show()
            onResult.invoke()
        } else {
            EasyPermissions.requestPermissions(
                this,
                "Granted for location",
                RC_LOCATION,
                fineLocation, coarseLocation
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this)
    }
}