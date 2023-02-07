package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1: Button = findViewById(R.id.button)
        val btn2: Button = findViewById(R.id.button2)
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)

    }

    override fun onClick(p0: View) {
        if (p0.getId() == R.id.button) {
            loadFragment(Fragment1())
        } else {
            loadFragment(Fragment2())
        }

    }

    fun loadFragment(f: Fragment) {
        // Менеджер переключения фрагментов
        val fm: FragmentManager = supportFragmentManager
        val ft: FragmentTransaction = fm.beginTransaction()
        ft.replace(R.id.fragmentContainerView, f)
        ft.commit()
    }
}