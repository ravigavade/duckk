package com.csaim.duckk.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DuckApi {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://random-d.uk/api/v2/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service : DuckApiService = retrofit.create(DuckApiService::class.java)
}