package com.example.e_mirim

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StudentCouncilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.school_council_activity)

        Toast.makeText(this, "학생회", Toast.LENGTH_SHORT).show()

        val dataList = listOf(
            StudentInfo(R.drawable.student, "김유진", "학생 회장"),
            StudentInfo(R.drawable.student_2, "박민지", "학생 부회장"),
            StudentInfo(R.drawable.student, "하도연", "총무부"),
            StudentInfo(R.drawable.student, "곽경희", "학예부"),
            StudentInfo(R.drawable.student_5, "양다연", "체육부"),
            StudentInfo(R.drawable.student_6, "김소리", "생활교양부"),
            StudentInfo(R.drawable.student, "정유진", "환경봉사부"),
            StudentInfo(R.drawable.student, "최윤영", "훈련안전부"),
            StudentInfo(R.drawable.student, "박선주", "서기"),
            StudentInfo(R.drawable.student, "임채영", "회계부")
        )




        val listView = findViewById<RecyclerView>(R.id.representative_Recycler)
        listView.setHasFixedSize(true)
        val adaptor = StudentAdaptor(dataList!!)
        listView.layoutManager = GridLayoutManager(this@StudentCouncilActivity, 2)

        listView.adapter = adaptor

    }
}