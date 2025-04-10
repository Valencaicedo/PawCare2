package com.example.pawcare2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PeluqueriaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peluqueria)

        // Ajuste de márgenes del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Botón de regresar (ImageView)
        val btnRegresar = findViewById<ImageView>(R.id.btn_regresar4)
        btnRegresar.setOnClickListener {
            val intent = Intent(this, ActivityInicio::class.java)
            startActivity(intent)
            finish()
        }

        // Botón de home (ImageView)
        val btnHome = findViewById<ImageView>(R.id.btnhome4)
        btnHome.setOnClickListener {
            val intent = Intent(this, ActivityInicio::class.java)
            startActivity(intent)
            finish()
        }
    }
}
