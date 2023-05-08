package com.example.imdbtop100.retrofit

import org.json.JSONObject
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface RetrofitApiCall {
    @Headers(
        "X-RapidAPI-Key:c1013262aamsh706a8f67b1e6ad3p1b4a90jsn936f9e42cf9a",
        "X-RapidAPI-Host:imdb-top-100-movies.p.rapidapi.com"
    )
    @GET("/")
    suspend fun getTop100Movies(): JSONObject


}