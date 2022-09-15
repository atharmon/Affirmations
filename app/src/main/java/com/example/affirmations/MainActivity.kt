package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataSet = DataSource().loadAffirmations()

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, dataSet)
        recyclerView.setHasFixedSize(true)
    }
}