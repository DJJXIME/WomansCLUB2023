package com.example.womansclub2023

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Pantalla3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla3)




        val btn3: Button = findViewById(R.id.button5)
        btn3.setOnClickListener {
            val intent: Intent = Intent(this, Pantalla4::class.java)
            startActivity(intent)
        }

    }
}