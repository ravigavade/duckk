package com.csaim.duckk.data.remote

import com.csaim.duckk.data.model.DuckResponse
import retrofit2.http.GET

interface DuckApiService {
    @GET("random")
    suspend fun getRandomDuck(): DuckResponse
}