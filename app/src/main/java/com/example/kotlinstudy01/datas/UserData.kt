package com.example.kotlinstudy01.datas

import com.google.gson.annotations.SerializedName

data class UserData(
    val id: String,
    val email: String,

    @SerializedName("nick_name")
    val nickname: String,

    @SerializedName("created_at")
    val createdAt: String,

    @SerializedName("updated_at")
    val updatedAt: String,
)
