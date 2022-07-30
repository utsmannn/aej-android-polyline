package com.utsman.mapspolyline

import android.animation.ValueAnimator
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker

class MarkerManager {

    fun moveMarkerSmoothly(marker: Marker, newLatLng: LatLng) {
        val animator = ValueAnimator.ofFloat(0f, 100f)
        val deltaLat = doubleArrayOf(newLatLng.latitude - marker.position.latitude)
        val deltaLon = newLatLng.longitude - marker.position.longitude
        val prevStep = floatArrayOf(0f)
        animator.duration = 1500

        animator.addUpdateListener { animation ->
            val deltaStep = (animation.animatedValue as Float - prevStep[0]).toDouble()
            prevStep[0] = animation.animatedValue as Float

            val updatedLat = marker.position.latitude + deltaLat[0] * deltaStep * 1.0 / 100
            val updatedLon = marker.position.longitude + deltaLon * deltaStep * 1.0 / 100

            val updatedLatLng = LatLng(updatedLat, updatedLon)
            marker.position = updatedLatLng
        }

        animator.start()
    }
}