package com.haydar.getapi.data

import com.google.gson.annotations.SerializedName
import retrofit2.http.GET
import retrofit2.http.Headers


data class User(

	@field:SerializedName("UserItem")

	val userItem: List<UserItem?>? = null
)