package com.example.kotlinstudy01

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinstudy01.api.APIList
import com.example.kotlinstudy01.api.ServerAPI
import retrofit2.create

abstract class BaseActivity: AppCompatActivity() {
    lateinit var mContext: Context
    lateinit var apiList: APIList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this

        val myRetrofit = ServerAPI.getRetrofit()
        apiList = myRetrofit.create(APIList::class.java)
    }

    abstract fun setupEvents()
    abstract fun setValues()
}