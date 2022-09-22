package com.example.e_mirim

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ScheduleAdaptor(val schedulelist: List<ScheduleInfo>)
    : RecyclerView.Adapter<ScheduleAdaptor.ScheduleViewHolder>(){

    class ScheduleViewHolder(val view: View)
        :RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(viewType, parent, false)
        return ScheduleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ScheduleViewHolder, position: Int) {
        val schedule = schedulelist[position]
        holder.view.findViewById<TextView>(R.id.schedule_list).text = ""
    }

    override fun getItemCount(): Int {
        return schedulelist.size
    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.school_schedule_recycler
    }
}