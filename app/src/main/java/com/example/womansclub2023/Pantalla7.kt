package com.example.womansclub2023

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Pantalla7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla7)


        val btn12: Button = findViewById(R.id.button_promos_regresar)
        btn12.setOnClickListener {
            val intent: Intent = Intent(this, Pantalla4::class.java)
            startActivity(intent)
        }

    }
}