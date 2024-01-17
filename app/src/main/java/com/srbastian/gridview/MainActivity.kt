package com.srbastian.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var gridView : GridView
    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gridView = findViewById(R.id.gridVIew)

        fillArrays()

        val adapter = PersoneAdapter(this, nameList, imageList)
        gridView.adapter = adapter
        gridView.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(applicationContext, "You Selected ${nameList[position]}", Toast.LENGTH_LONG).show()
        }
    }

    fun fillArrays()
    {
        nameList.add("Gunter")
        nameList.add("Fin")
        nameList.add("Ice King")
        nameList.add("Bubblegum Princess")
        nameList.add("Marceline")
        nameList.add("Jake")
        nameList.add("The lich")
        nameList.add("Flame Princess")

        imageList.add(R.drawable.gunter)
        imageList.add(R.drawable.fin)
        imageList.add(R.drawable.ice_king)
        imageList.add(R.drawable.bublegum)
        imageList.add(R.drawable.marceline)
        imageList.add(R.drawable.jake)
        imageList.add(R.drawable.the_lich)
        imageList.add(R.drawable.flame_princess)

    }
}