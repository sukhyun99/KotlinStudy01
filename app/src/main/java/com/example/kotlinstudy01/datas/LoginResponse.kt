package com.example.kotlinstudy01.datas

data class LoginResponse(
    val code : Int,
    val message : String,
    val data : DataResponse,
)
