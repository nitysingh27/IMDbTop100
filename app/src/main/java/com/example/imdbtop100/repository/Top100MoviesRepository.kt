package com.example.imdbtop100.repository

import com.example.imdbtop100.model.MoviesResponseEntity
import com.example.imdbtop100.retrofit.RetrofitApiCall
import org.json.JSONObject
import javax.inject.Inject

class Top100MoviesRepository @Inject constructor(
    var retrofitApiCall: RetrofitApiCall
) {
    suspend fun getTop100Movies():List<MoviesResponseEntity>{
        return retrofitApiCall.getTop100Movies()
    }
}