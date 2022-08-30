package com.example.e_mirim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ScheduleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)

        Toast.makeText(this, "학사일정", Toast.LENGTH_SHORT).show()
    }
}