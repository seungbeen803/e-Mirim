package com.example.e_mirim

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class MirimSchoolInfoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.school_council_fragment, container, false)

        view.findViewById<Button>(R.id.student_council).setOnClickListener {
            val intent = Intent(requireContext(), StudentCouncilActivity::class.java)
            intent.putExtra("school_council", 1)
            startActivity(intent)
        }

        view.findViewById<Button>(R.id.schedule).setOnClickListener {
            val intent = Intent(requireContext(), ScheduleActivity::class.java)
            intent.putExtra("schedule", 1)
            startActivity(intent)
        }
        return view
    }
}