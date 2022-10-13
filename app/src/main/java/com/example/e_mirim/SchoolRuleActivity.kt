package com.example.e_mirim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SchoolRuleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_school_rule)

        Toast.makeText(this, "교칙", Toast.LENGTH_SHORT).show()

        /*
        val schoolRuleList = ArrayList<SchoolRuleInfo>()

        fun schoolRuleData() {
            val costume_rule = "복장"
            val firstContent = ArrayList<SchoolRuleInfo>()
            firstContent.add(SchoolRuleInfo("교복입기"))

            val life_rule = "생활"
            val secondContent = ArrayList<SchoolRuleInfo>()
            secondContent.add(SchoolRuleInfo("인사하기"))

            schoolRuleList.add(SchoolRuleTitleInfo(costume_rule, firstContent))
            schoolRuleList.add(SchoolRuleTitleInfo(life_rule, secondContent))
        }
        */
    }
}