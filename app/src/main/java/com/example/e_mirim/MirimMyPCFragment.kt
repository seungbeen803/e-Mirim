package com.example.e_mirim

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class MirimMyPCFragment : Fragment() {

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.mirim_mypcprotector_fragment, container, false)

            view.findViewById<Button>(R.id.directions).setOnClickListener {
                var intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://drive.google.com/file/d/1Evtmvh2QGztH7R2cQ8q94lYTAWEzx6O7/view?usp=sharing"))
                startActivity(intent)
            }
            return view
        }
}