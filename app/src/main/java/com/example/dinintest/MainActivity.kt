package com.example.dinintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rcview = findViewById<>(R.id.rcviewlayout)

        var initiallist = mutableListOf(
            dataTodo("study API calling",false),
            dataTodo("follow Diet",true),
            dataTodo("gym daily",true)
        )

        val adapter = Todoadapter(initiallist)



    }
}