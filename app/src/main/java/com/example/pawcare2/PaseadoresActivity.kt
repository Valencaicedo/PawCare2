package com.example.pawcare2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PaseadoresActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_paseadores)

        val btnRegresar = findViewById<ImageView>(R.id.btn_regresar)

        btnRegresar.setOnClickListener {
            val intent = Intent(this, ActivityInicio::class.java)
            startActivity(intent)
            finish() // Opcional: evita que esta pantalla quede en el historial
        }
        // Botón de home (ImageView)
        val btnHome = findViewById<ImageView>(R.id.btnhome5)
        btnHome.setOnClickListener {
            val intent = Intent(this, ActivityInicio::class.java)
            startActivity(intent)
            finish()
        }
    }
}