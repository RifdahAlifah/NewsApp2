package com.rifdahalf.newsapp2.network

import com.rifdahalf.newsapp2.model.ResponseNews
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("top-headlines")
    fun getTopHeadlinesNews(
        @Query("country") country : String?,
        @Query("apiKey") apiKey : String?
    ): Call<ResponseNews>
}