package com.example.e_mirim

import androidx.recyclerview.widget.RecyclerView

class RuleAdaptor (
    val schoolRuleList: List<SchoolRuleTitleInfo>
) : RecyclerView.Adapter<RuleAdaptor.MyViewHolder>() {

    class MyViewHolder(
        val binding: ItemSectionBinding
    ) RecyclerView.ViewHolder(binding.root) {

        fun bind(SchoolRuleTitleInfo: SchoolRuleTitleInfo) {

        }
    }

}