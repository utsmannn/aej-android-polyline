package com.utsman.mapspolyline.network

import com.utsman.mapspolyline.entity.LocationData
import com.utsman.mapspolyline.network.response.ReserveLocationResponse

object ResponseMapper {

    fun mapReserveLocationResponseToLocation(reserveLocationResponse: ReserveLocationResponse?): LocationData {
        val address = reserveLocationResponse?.data?.address.run {
            LocationData.Address(
                city = this?.city.orEmpty(),
                country = this?.country.orEmpty(),
                distric = this?.distric.orEmpty()
            )
        }
        val coordinate = reserveLocationResponse?.data?.coordinate.run {
            LocationData.Coordinate(
                latitude = this?.latitude ?: 0.0,
                longitude = this?.longitude ?: 0.0
            )
        }
        val name = reserveLocationResponse?.data?.name.orEmpty()
        return LocationData(
            address = address,
            coordinate = coordinate,
            name = name
        )
    }
}