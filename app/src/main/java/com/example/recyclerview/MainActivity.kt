package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model>()
        arrayList.add(Model("Chips","Description chips",R.drawable.icon1))
        arrayList.add(Model("Cake","Description cake",R.drawable.icon2))
        arrayList.add(Model("Jam","Description jam",R.drawable.icon3))
        arrayList.add(Model("Soup","Description soup",R.drawable.icon4))


        val myAdapter= MyAdapter(arrayList,this)

        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=myAdapter

    }
}