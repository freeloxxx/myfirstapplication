package com.example.myfirstapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_click_me = findViewById(R.id.btn_click_me) as Button
        val btn_non= findViewById(R.id.btn_click_me_non) as Button
        btn_click_me.setOnClickListener {
            val intent = Intent(this, FullscreenActivity::class.java)
            startActivity(intent)
        }
        btn_non.setOnClickListener {
            val intent = Intent(this, A2::class.java)
            startActivity(intent)
        }

    }

}
