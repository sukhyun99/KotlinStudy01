package com.example.kotlinstudy01.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.kotlinstudy01.R
import com.example.kotlinstudy01.datas.UserData

class MainListViewAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<UserData>
): ArrayAdapter<UserData>(mContext, resId, mList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(resId, null)
        }

        val row = tempRow!!

        return row
    }
}