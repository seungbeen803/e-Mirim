package com.example.e_mirim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.CalendarView
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var drawerToggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val navView = findViewById<NavigationView>(R.id.drawer_nav_view)

        navView.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.officeRoom -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame, OfficeRoomFragment())
                        .commit()
                }
                R.id.My_PC_Protector -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame, MirimMyPCFragment())
                        .commit()
                }
                R.id.statutes -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame, MirimStatutesFragment())
                        .commit()
                }
                R.id.student_Council -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame, MirimSchoolInfoFragment())
                        .commit()
                }
                R.id.contest -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame, MirimContestFragment())
                        .commit()
                }
            }
            // (메뉴를) 수동으로 닫아 줌
            drawerLayout.closeDrawers()

            // ture로 return
            // 모든 일이 정상적으로 끝났으면 true로 retrun
            true
        }

        drawerToggle = object : ActionBarDrawerToggle(
            this,
            drawerLayout,
            R.string.drawer_open,
            R.string.drawer_close
        ){}
        // false 할 일 없음
        // drawerLayout과 햄버거 아이콘과 연결 시켜주는 코드
        // isDrawerIndicatorEnabled 속성을 true로 설정해
        // 액션바의 왼쪽 상단에 위치한 햄버거 아이콘을 통해 내비게이션 드로어를 표시하고 숨길 수 있도록 합니다.
        drawerToggle.isDrawerIndicatorEnabled = true
        drawerLayout.addDrawerListener(drawerToggle)
        // etDisplayHomeAsUpEnabled 메서드를 호출해서 햄버거 아이콘을 표시하고
        // 해당 아이콘을 클릭해 내비게이션 드로어를 열고 닫을 수 있도록 설정함
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        // 호출을 안 해도 기능상 문제는 없으나 호출 하는 것이 좋음
        // 햄버거 열면 화살표로 변하고 끄면 햄버거 메뉴로 변하는 것
        drawerToggle.syncState()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(drawerToggle.onOptionsItemSelected(item)){
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}