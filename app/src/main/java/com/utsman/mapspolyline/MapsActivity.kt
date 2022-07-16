package com.utsman.mapspolyline

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions
import com.google.maps.android.PolyUtil
import com.utsman.mapspolyline.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(point1, 14f))

        val polyline = PolylineOptions()
            .addAll(coordinates)
            .width(6f)
            .color(Color.RED)
        mMap.addPolyline(polyline)

    }
}

val polylineShape =
    "BG3nggMk506rGkNnGoGvCoGnBkS7BwH7BsiBrJoVnGkX_EwWnGoL7BkNvC8QvC0U_EwCkDwC0F0KkXkDoGgFkIUwCTwCzFsEgF4NwCsJUwCUwCUoGnBwWUoGoB0FrE8G_E4InVsiB3DgFvCwCzFwCzFoBvH8B3DUzFUjDAzP8BrdkD_TwCzKwCvHwCrEwC7B4DvCkIjD8LnB8G7BkSAsJAoGoB4I8BoLoBoGoBoG8BkIoB4DwC8G0F7BwCvCwCnB4X7GkhBrJof3IsOvC8GnBkInBwMT8LAwMA4NUgPoBgFATgFnBsE7B8G7BkIjD4InLofvC8GnBsEvC8GT8B_EkSnB0FvCwMnG0ejDgUToG7BgKT4DnBwHvCkInBgFrE4NvC8G7BgF_E0KnGoLzKkXzKoVnGsOvH0PzFkNrJgUnBwCvCwCnG0P7BsE7G0PT8BjD8G7BsJAkIU4DoBgFsEwMoBkDkIkSkD8GsE8LkDkIwCoGsEoLwHwR8BsE8B8GU8GTwHvC0F3DgF_EsEjD8BvCoB7LgF3csJ_J4DvHkD_J4DvM4DrEoBnG4DzFUjIU_O8B_JoBrJoBvW4DnGU7QwC_J8BrYgFrJwC7fkInf0Kvb0K3IkD3NgFrE8BzFwCnLgF7GkDnV4IrJkD3I4DnpB8Q3N0FrsB8Qj6BoVnpBwMvH8BrEoB_JkDnzBkN3kCkS7f4IzPgFjNgFjIA3IwC_E8B3I4D3IsE7GsE_JwHvHkIjIkIvb0e_TsYnVoavR0ZnLkS_JoVjIwR_E0K3D0KvCsJvC4NzFgejD4STkD7BwM7BkI7BkITkDrEwW_EsT7LouB7B4I7BwHnB0FzF0evC0PjD8LzFkNnGwWnQk_B7GkcjI8frEwR_EwR_EsOrEoLvC4N7BkI_EoQzFgPnGsOnGoL7G0KnGgK3D8G3DkI7BsEvCwHzFgPnGsO7GwMzF4IrE8GjDsEnB8BnL0P3D0FrEoGvC4DrOgUnLsOrO4SvRoV3SkXnkBopBvHgKzF4I_EsJrEsJ3DgKvC4I3D8Q7BsJ7BwMnBwHnBoGnBgFnBgFT4DnGUjDUzFoB_J8B3N8B7L8B_JoBnGU_EgFrEgFnVkcjSgZvHgKvHsJjI0KrEgFjDsEvCsEToBjD8GrEoL3NsnB3D8LjD8L7B4I7B0KvCkSnBwMTwMAgPA8GAw5BvHUjNvC_djD_T3DzK3DzFrEvC7G_EjD_JvCnLjDnG7B7LnG3DvCjN_EnarJ_Y7BniC8GjXgF7BwHvCwHjDkI7BsEnBwC7BjDvCjD3D3D3NvMjI7G3InGnLnGrO7GvRjInLrEnQzFze_JjN3DvMjDjNvC_OvCjN7B7BA3S7BzPnBvHT3I7B7G7BvHvCrJ3DrOvHvMvHnBT7LvHvH_E7GnGvCvCvCvCrE_E_EnG_EnGjIzKzFjIjDrE7LvRrEnG3DnGrEvHrJrOnLvRrEnGjInLnGjI7BvC7QjX7QjX3D_E_OnVnGjInGjInLjN3NzP_JrJjNzK_JvHjNrJrT3NvW_OzKvHvH_E3NrJrEvCzKnGvM7GjIrEjN7G_JrEjIjD7QzF7arJnB4InBoLnBoVnBwRoLssB_E8G7B4DvCgK7G0oB3D0U7BkDjD8BzFoB3D8BvCkD3D4I3NgejDgF3DwCzU0F_ErJrErE7G3D_Y7G3D7B3DjDzFvH_7B3_BjDjDjNrTzK3SjD3DzPrOnQrOnVzKrJ3DnVjIv0B_T3SzKzFnGjDzFnGnQnBrEnB3D_EnLvHvMnanuB4D7G4DvHoBvCwCzFkDzFkDjD_EvHvCrE7BrE7BzFpD9J"