package com.example.e_mirim

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdaptor(val studentlist: List<StudentInfo>)
    : RecyclerView.Adapter<StudentAdaptor.ImageViewHolder>(){

    class ImageViewHolder(val view: View)
        :RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(viewType, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val student = studentlist[position]
        holder.view.findViewById<TextView>(R.id.student_name).text = "${student.name}"
        holder.view.findViewById<Button>(R.id.representative_main).text = "${student.title}"
        holder.view.findViewById<ImageView>(R.id.student_picture).setImageResource(student.image!!)
    }

    override fun getItemCount(): Int {
        return studentlist.size
    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.item2_recycler
    }
}