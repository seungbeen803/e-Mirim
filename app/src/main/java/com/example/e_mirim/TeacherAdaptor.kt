package com.example.e_mirim

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TeacherAdaptor(val teacherlist: List<TeacherInfo>)
    : RecyclerView.Adapter<TeacherAdaptor.ImageViewHolder>(){

        class ImageViewHolder(val view: View)
            :RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(viewType, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val teacher = teacherlist[position]
        holder.view.findViewById<TextView>(R.id.teacher_name).text = "${teacher.name}"
        holder.view.findViewById<ImageView>(R.id.teacher_picture).setImageResource(teacher.image!!)
    }

    override fun getItemCount(): Int {
        // 전달한 리스트의 길이 리턴
        // 전체 목록에서 표시해야할 데이터의 개수이기 때문
        return teacherlist.size
    }

    override fun getItemViewType(position: Int): Int {
        // 유일하게 구분하게 할 수 있는 숫자 리턴
        // 레이아웃 리소스 식별자를 숫자로 반환
        return R.layout.item_recycler
    }
}