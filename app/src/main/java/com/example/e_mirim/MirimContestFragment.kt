package com.example.e_mirim

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class MirimContestFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.mirim_contest_fragment, container, false)

        view.findViewById<Button>(R.id.contest_info).setOnClickListener {
            var intent = Intent()
        }
        return view
    }
}