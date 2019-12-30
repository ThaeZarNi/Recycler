package com.example.project_recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project_recycler.adapter.FruitAdapter
import com.example.project_recycler.model.Fruit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)

        //recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        //recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        val fruitList = ArrayList<Fruit>()
        fruitList.add(Fruit("Apple",R.drawable.apple))
        //fruitList.add(Fruit("Orange"))
        //fruitList.add(Fruit("Blueberry"))
        fruitList.add(Fruit("Strawberry",R.drawable.strawberry))
        //fruitList.add(Fruit("RedBerry"))
        //fruitList.add(Fruit("Coconut"))
        fruitList.add(Fruit("Peach",R.drawable.peach))
        fruitList.add(Fruit("Grape",R.drawable.grape))


        val fruitAdapter = FruitAdapter(fruitList)

        recyclerView.adapter = fruitAdapter
    }
}
