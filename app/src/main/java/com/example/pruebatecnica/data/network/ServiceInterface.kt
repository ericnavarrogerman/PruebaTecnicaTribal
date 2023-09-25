package com.example.pruebatecnica.data.network

import retrofit2.http.GET

interface ServiceInterface {
    @GET("jokes/categories")
    suspend fun listPalabras(): List<String>
}