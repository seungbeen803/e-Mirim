package com.example.e_mirim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.text.SimpleDateFormat
import java.util.*

class ScheduleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)

        Toast.makeText(this, "학사일정", Toast.LENGTH_SHORT).show()
        
        val dataList = listOf(
            ScheduleInfo("체육대회"),
            ScheduleInfo("모교 방문"),
            ScheduleInfo("중간 고사")
        )

        val scheduleView = findViewById<RecyclerView>(R.id.schedule_Recycler)
        scheduleView.setHasFixedSize(true)
        val adaptor = ScheduleAdaptor(dataList!!)
        scheduleView.layoutManager = LinearLayoutManager(this)

        scheduleView.adapter = adaptor
    }
}