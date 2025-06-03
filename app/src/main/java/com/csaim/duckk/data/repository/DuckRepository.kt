package com.csaim.duckk.data.repository

import com.csaim.duckk.data.model.DuckResponse
import com.csaim.duckk.data.remote.DuckApi
import com.csaim.duckk.data.remote.DuckApiService

class DuckRepository {

    suspend fun getRandomDuck() : DuckResponse{
        return DuckApi.service.getRandomDuck()
    }
}