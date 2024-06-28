package com.kcthomas.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RemoteDogSource {

    // Inject into constructor via Hilt in PROD
    private val api = Retrofit.Builder()
        .baseUrl("https://dog.ceo/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(DogApi::class.java)

    suspend fun getDog(): Dog? = api.getDog()

}