package com.example.e_mirim

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class DataBaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_database)

        val db = Firebase.firestore
        val community = hashMapOf(
            "title" to "notice_board",
            "content" to "contents",
            "date" to "dates",
            "password" to "passwords"
        )

        db.collection("post").document("communication")
            .set(community)
            .addOnSuccessListener { Log.d("mytag", "DocumentSnapshhot successfully written!") }
            .addOnFailureListener { e -> Log.w("mytag", "Error writing", e)}

    }
}