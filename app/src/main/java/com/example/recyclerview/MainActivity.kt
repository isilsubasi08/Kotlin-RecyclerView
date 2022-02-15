package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.max

class MainActivity : AppCompatActivity() {

      lateinit var arrayList : ArrayList<Model>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arrayList = ArrayList<Model>()
        arrayList.add(Model("Chips","Description chips",R.drawable.icon1))
        arrayList.add(Model("Cake","Description cake",R.drawable.icon2))
        arrayList.add(Model("Jam","Description jam",R.drawable.icon3))
        arrayList.add(Model("Soup","Description soup",R.drawable.icon4))

        val myAdapter= MyAdapter(arrayList,this)

        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.isNestedScrollingEnabled = false
        recyclerView.adapter=myAdapter
        var itemTouchHelper = ItemTouchHelper(SwipeToDelete(myAdapter))
        itemTouchHelper.attachToRecyclerView(recyclerView)

    }

}