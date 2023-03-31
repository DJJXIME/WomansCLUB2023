package com.example.womansclub2023

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Pantalla4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla4)




        val btn4: Button = findViewById(R.id.button_shows)
        btn4.setOnClickListener {
            val intent: Intent = Intent(this, Pantalla5::class.java)
            startActivity(intent)
        }

        val btn5: Button = findViewById(R.id.button_imagenes)
        btn5.setOnClickListener {
            val intent: Intent = Intent(this, Pantalla6::class.java)
            startActivity(intent)
        }

        val btn6: Button = findViewById(R.id.button_promos)
        btn6.setOnClickListener {
            val intent: Intent = Intent(this, Pantalla7::class.java)
            startActivity(intent)
        }

        val btn7: Button = findViewById(R.id.button_menu)
        btn7.setOnClickListener {
            val intent: Intent = Intent(this, Pantalla8::class.java)
            startActivity(intent)
        }

        val btn8: Button = findViewById(R.id.button_reservar)
        btn8.setOnClickListener {
            val intent: Intent = Intent(this, Pantalla3::class.java)
            startActivity(intent)
        }

        val btn9: Button = findViewById(R.id.button_regresar)
        btn9.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}