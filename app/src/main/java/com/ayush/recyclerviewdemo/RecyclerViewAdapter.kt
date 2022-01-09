package com.ayush.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(val items : ArrayList<Int>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){
    /*
    Reference : https://youtu.be/oDfl-xLXiac
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewtemp = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item,parent,false)
        return ViewHolder(viewtemp)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val num = items[position]
        holder.item_text.text = num.toString()
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view : View): RecyclerView.ViewHolder(view){
        val item_text = view.findViewById<TextView>(R.id.recycler_view_item_text)
    }
}