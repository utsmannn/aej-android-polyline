package com.utsman.mapspolyline.network

import com.utsman.mapspolyline.network.response.ReserveLocationResponse
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface WebServices {

    @GET(EndPoint.RESERVE)
    suspend fun reserveCoordinate(
        @Query("coordinate") coordinate: String
    ): Response<ReserveLocationResponse>

    companion object {
        private const val BASE_URL = "https://b4df-2001-448a-2020-9599-1918-3553-e718-9dd1.ap.ngrok.io"

        fun create(): WebServices {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(WebServices::class.java)
        }
    }

    object EndPoint {
        const val RESERVE = "/api/location/reserve"
    }
}