package com.example.kotlinstudy01.api

import com.example.kotlinstudy01.datas.LoginResponse
import retrofit2.Call
import retrofit2.http.*

interface APIList {

    @FormUrlEncoded
    @POST("/user")
    fun postRequestLogIn(
        @Field("email") email: String,
        @Field("password") password: String,
    ): Call<LoginResponse>

    @GET("/user/fried")
    fun getRequestFriendList(
        @Header("X-Http-Token") token: String,
        @Query("type ") type: String,
    )
}