package com.example.e_mirim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class OfficeRoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_office_room)

        val num = intent.getIntExtra("office_num", -1)!!
        Toast.makeText(this, "${num} 교무실", Toast.LENGTH_SHORT).show()

        findViewById<Button>(R.id.back_btn).setOnClickListener {
            finish()
        }
    }
}