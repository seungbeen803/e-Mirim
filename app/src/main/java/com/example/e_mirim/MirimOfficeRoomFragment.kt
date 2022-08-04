package com.example.e_mirim

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class OfficeRoomFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.mirim_officeroom_fragment, container, false)

        val intent = Intent(requireContext(), OfficeRoomActivity::class.java)
        view.findViewById<Button>(R.id.one_officeRoom).setOnClickListener {
            intent.putExtra("office_num", 1)
            startActivity(intent)
        }

        view.findViewById<Button>(R.id.two_officeRoom).setOnClickListener {
            intent.putExtra("office_num", 2)
            startActivity(intent)
        }

        view.findViewById<Button>(R.id.three_officeRoom).setOnClickListener {
            intent.putExtra("office_num", 3)
            startActivity(intent)
        }

        view.findViewById<Button>(R.id.four_officeRoom).setOnClickListener {
            intent.putExtra("office_num", 4)
            startActivity(intent)
        }

        view.findViewById<Button>(R.id.five_officeRoom).setOnClickListener {
            intent.putExtra("office_num", 5)
            startActivity(intent)
        }

        return view
    }
}