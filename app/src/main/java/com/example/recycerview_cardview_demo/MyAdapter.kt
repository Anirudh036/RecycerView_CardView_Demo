package com.example.recycerview_cardview_demo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter : RecyclerView.Adapter<MyAdapter.MyHolder>() {
    var city_data = arrayOf("1.5","2.0","3","3.2","4")
    var state_data = arrayOf("cupcake","donut","eclair","froyo","marsh")
    var image_data = arrayOf(R.drawable.cupcake,R.drawable.donut,R.drawable.eclair,R.drawable.froyo,R.drawable.marsh)
    inner class MyHolder(view:View) : RecyclerView.ViewHolder(view)
    {
        var city : TextView
        var state : TextView
        var image :ImageView
        init {
            city = view.findViewById(R.id.textView1)
            state = view.findViewById(R.id.textView2)
            image = view.findViewById(R.id.image1)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
       var v = LayoutInflater.from(parent.context).inflate(R.layout.mylayout,parent,false)
        return MyHolder(v)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.city.text = city_data[position]
        holder.state.text = state_data[position]
        holder.image.setImageResource(image_data[position])


    }

    override fun getItemCount(): Int {
      return city_data.size
    }
}