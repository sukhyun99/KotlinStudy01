package com.example.kotlinstudy01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.kotlinstudy01.adapters.MainListViewAdapter
import com.example.kotlinstudy01.adapters.MainViewPager2Adapter
import com.example.kotlinstudy01.databinding.ActivityMainBinding
import com.example.kotlinstudy01.datas.UserData

class MainActivity : BaseActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        val adapter = MainViewPager2Adapter(this)
        binding.mainViewPager2.adapter = adapter
    }
}