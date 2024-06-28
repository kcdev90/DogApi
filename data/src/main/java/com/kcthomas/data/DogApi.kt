package com.kcthomas.data

import retrofit2.http.GET

interface DogApi {
    @GET("api/breeds/image/random")
    suspend fun getDog(): Dog?
}