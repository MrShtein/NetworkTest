package ru.mrshtein.network

import retrofit2.Response
import retrofit2.http.GET

interface NetworkService {
    @GET("/fact")
    suspend fun getCatsFact(): Response<Fact>
}