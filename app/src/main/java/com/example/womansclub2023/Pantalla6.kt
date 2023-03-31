package com.example.womansclub2023

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Pantalla6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla6)


        val btn11: Button = findViewById(R.id.button_local_regresar)
        btn11.setOnClickListener {
            val intent: Intent = Intent(this, Pantalla4::class.java)
            startActivity(intent)
        }

    }
}