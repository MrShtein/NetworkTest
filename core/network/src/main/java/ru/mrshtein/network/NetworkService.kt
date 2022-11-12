package ru.mrshtein.network

import com.google.gson.GsonBuilder
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

interface NetworkService {
    @GET("/api/v1/animal/type")
    suspend fun getAnimalsTypes(): Response<List<AnimalType>>
}