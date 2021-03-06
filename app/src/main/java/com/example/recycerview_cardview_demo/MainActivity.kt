package com.example.recycerview_cardview_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerview = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerview.adapter = MyAdapter()

        var layout = LinearLayoutManager(this)
        recyclerview.layoutManager = layout
    }
}