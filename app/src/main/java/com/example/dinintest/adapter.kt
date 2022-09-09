package com.example.dinintest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Todoadapter(
    var todos : List<dataTodo>
) : RecyclerView.Adapter<Todoadapter.Todoviewholder>(){

    inner class Todoviewholder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView : TextView = itemView.findViewById(R.id.tvtodolist)
        val checkBox : CheckBox = itemView.findViewById(R.id.cbtodolist)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Todoviewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.listitem,parent,false)
        return Todoviewholder(view )
    }

    override fun onBindViewHolder(holder: Todoviewholder, position: Int) {
        holder.textView.text = todos[position].text
        holder.checkBox.isChecked = todos[position].checkbox

    }

    override fun getItemCount(): Int {
       return todos.size
    }


}

