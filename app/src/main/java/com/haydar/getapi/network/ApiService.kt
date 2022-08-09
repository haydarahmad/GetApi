package com.haydar.getapi.network

import com.haydar.getapi.data.UserItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface ApiService {
    @GET("users")
    @Headers("Authorization: token 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")
    fun getListUser() : Call<ArrayList<UserItem>>
}