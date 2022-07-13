package com.example.kotlinstudy01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.kotlinstudy01.databinding.ActivityLoginBinding
import com.example.kotlinstudy01.datas.LoginResponse
import com.example.kotlinstudy01.utils.ContextUtil
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : BaseActivity() {
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        binding.btnLogIn.setOnClickListener {
            apiList.postRequestLogIn(
                binding.edtEmail.text.toString(),
                binding.EdtPassWord.text.toString()
            ).enqueue(object: Callback<LoginResponse> {
                override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                    if (response.isSuccessful) {
                        val res = response.body()!!
                        Log.d("결과", res.data.token)

                        ContextUtil.setLoginUserToken(mContext, res.data.token)

                        val myIntent = Intent(mContext, MainActivity::class.java)
                        startActivity(myIntent)
                        finish()
                    }
                }

                override fun onFailure(call: Call<LoginResponse>, t: Throwable) {

                }

            })
        }
    }

    override fun setValues() {

    }
}