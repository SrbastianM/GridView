package com.srbastian.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import java.text.FieldPosition

class PersoneAdapter(
    var context: Context,
    var nameList: ArrayList<String>,
    var imageList: ArrayList<Int>) : BaseAdapter() {


    override fun getCount(): Int {
        return nameList.size
    }

    override fun getItem(p0: Int): Any? {
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view : View = LayoutInflater.from(parent?.context).inflate(R.layout.custume_layout, parent, false)
        var personeName : TextView = view.findViewById(R.id.textView)
        var personeImage : ImageView = view.findViewById(R.id.imageView)

        personeName.text = nameList[position]
        personeImage.setImageResource(imageList.get(position))

        return view

    }
}