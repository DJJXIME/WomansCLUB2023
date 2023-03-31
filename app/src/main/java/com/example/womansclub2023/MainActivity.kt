package com.example.womansclub2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.button3)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, Pantalla2:: class.java)
            startActivity(intent)
        }

        val btn1: Button = findViewById(R.id.button2)
        btn1.setOnClickListener {
            val intent: Intent = Intent(this, Pantalla4::class.java)
            startActivity(intent)
        }



    }
}