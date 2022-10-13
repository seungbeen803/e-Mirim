package com.example.e_mirim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class OfficeRoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_office_room)

        val num = intent.getIntExtra("office_num", -1)!!
        Toast.makeText(this, "${num} 교무실", Toast.LENGTH_SHORT).show()

        // map<키, 값>
         val map = mutableMapOf<Int, List<TeacherInfo>>()
        // put으로 값 가져오기
        map.put(1, listOf(
            TeacherInfo(R.drawable.img, "김현수"),
            TeacherInfo(R.drawable.img, "윤성웅"),
            TeacherInfo(R.drawable.img, "이호연"),
            TeacherInfo(R.drawable.img, "윤선희"),
            TeacherInfo(R.drawable.img_1_4, "민주리"),
            TeacherInfo(R.drawable.img, "권지웅"),
            TeacherInfo(R.drawable.img, "김영철"),
            TeacherInfo(R.drawable.img, "신혜영"),
            TeacherInfo(R.drawable.img_1_9, "이철호"),
            TeacherInfo(R.drawable.img, "임정훈"),
            TeacherInfo(R.drawable.img, "이철희"),
            TeacherInfo(R.drawable.img_1_11, "정혜선"),
            TeacherInfo(R.drawable.img_1_12, "김지훈"),
            TeacherInfo(R.drawable.img, "손명수"),
            TeacherInfo(R.drawable.img, "이하얀")
        ))

        map.put(2, listOf(
            TeacherInfo(R.drawable.img_2, "박향규"),
            TeacherInfo(R.drawable.img_2_2, "김명준"),
            TeacherInfo(R.drawable.img_2_3, "이은주"),
            TeacherInfo(R.drawable.img_3_7, "이정임"),
            TeacherInfo(R.drawable.img_2_5, "최규정"),
            TeacherInfo(R.drawable.img_2_6, "김보경"),
            TeacherInfo(R.drawable.img_2_7, "고낙은"),
            TeacherInfo(R.drawable.img_3_7, "김민혜"),
            TeacherInfo(R.drawable.img_2_9, "박지우")
            ))

        map.put(3, listOf(
            TeacherInfo(R.drawable.img_3_2, "백현정"),
            TeacherInfo(R.drawable.img_3_2, "함기훈"),
            TeacherInfo(R.drawable.img_3_2, "이재민"),
            TeacherInfo(R.drawable.img_3_7, "이호걸"),
            TeacherInfo(R.drawable.img_3_5, "박성래"),
            TeacherInfo(R.drawable.img_3_7, "유병석"),
            TeacherInfo(R.drawable.img_3_7, "이형섭"),
            TeacherInfo(R.drawable.img_3_7, "장민주")

        ))

        map.put(4, listOf(
            TeacherInfo(R.drawable.img_3_2, "신혜정"),
            TeacherInfo(R.drawable.img_3_7, "이대형"),
            TeacherInfo(R.drawable.img_3_2, "이종태"),
            TeacherInfo(R.drawable.img_4_4, "우호식"),
            TeacherInfo(R.drawable.img_3_2, "김종성"),
            TeacherInfo(R.drawable.img_3_7, "오수연")
        ))

        map.put(5, listOf(
            TeacherInfo(R.drawable.img_3_2, "이세호"),
            TeacherInfo(R.drawable.img_3_7, "김윤환"),
            TeacherInfo(R.drawable.img_3_2, "권오재"),
            TeacherInfo(R.drawable.img_3_7, "정하나")
        ))


        // 암기
        val dataList = map.get(num!!)

        val listView = findViewById<RecyclerView>(R.id.teacher_Recycler)
        listView.setHasFixedSize(true)
        val adaptor = TeacherAdaptor(dataList!!)
        listView.layoutManager = GridLayoutManager(this@OfficeRoomActivity, 2)

        listView.adapter = adaptor

        listView.setHasFixedSize(true)
    }
}