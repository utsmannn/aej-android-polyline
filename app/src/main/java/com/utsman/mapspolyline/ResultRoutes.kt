package com.utsman.mapspolyline


import com.google.gson.annotations.SerializedName

data class ResultRoutes(
    @SerializedName("data")
    val `data`: Data?,
    @SerializedName("message")
    val message: String?,
    @SerializedName("status")
    val status: Boolean?
) {
    data class Data(
        @SerializedName("route")
        val route: List<Route?>?
    ) {
        data class Route(
            @SerializedName("latitude")
            val latitude: Double?,
            @SerializedName("longitude")
            val longitude: Double?
        )
    }
}