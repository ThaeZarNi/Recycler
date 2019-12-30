package com.example.project_recycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project_recycler.R
import com.example.project_recycler.model.Fruit
import kotlinx.android.synthetic.main.fruit.view.*

class FruitAdapter(val fruitList: ArrayList<Fruit>) : RecyclerView.Adapter<FruitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fruit, parent, false)
        return FruitViewHolder(view)
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        holder.fruitName.text = fruitList[position].name
        holder.fruitImage.setImageResource(fruitList[position].image)
    }

}

class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val fruitName = itemView.findViewById<TextView>(R.id.txt_fruit)
    val fruitImage=itemView.findViewById<ImageView>(R.id.image_view)
}