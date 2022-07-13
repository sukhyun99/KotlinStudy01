package com.example.kotlinstudy01.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kotlinstudy01.fragments.MyProfileFragment
import com.example.kotlinstudy01.fragments.PeopleListFragment

class MainViewPager2Adapter(fa: FragmentActivity): FragmentStateAdapter(fa) {
    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> PeopleListFragment()
            else -> MyProfileFragment()
        }
    }
}