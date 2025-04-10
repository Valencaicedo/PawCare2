package com.example.pawcare2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityInicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_inicio)

        val btnPaseo = findViewById<ImageView>(R.id.btn_paseo)
        val btnAlojamiento = findViewById<ImageView>(R.id.btn_alojamiento)
        val btnEscuela = findViewById<ImageView>(R.id.btn_escuela)
        val btnPeluqueria = findViewById<ImageView>(R.id.btn_peluqueria)

        btnPaseo.setOnClickListener {
            startActivity(Intent(this, PaseadoresActivity::class.java))
        }

        btnAlojamiento.setOnClickListener {
            startActivity(Intent(this, AlojamientoActivity::class.java))
        }

        btnEscuela.setOnClickListener {
            startActivity(Intent(this, EscuelaActivity::class.java))
        }

        btnPeluqueria.setOnClickListener {
            startActivity(Intent(this, PeluqueriaActivity::class.java))
        }
    }
}


