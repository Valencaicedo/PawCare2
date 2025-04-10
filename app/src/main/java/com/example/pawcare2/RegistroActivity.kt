package com.example.pawcare2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registro)

        // Ajustar los márgenes de la vista principal según las barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Código del botón para registrarse
        val btnRegister = findViewById<Button>(R.id.btnCrear)
        btnRegister.setOnClickListener {
            Toast.makeText(this, "Cuenta creada :), bienvenido :D ", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ActivityInicio::class.java)
            startActivity(intent)
            finish() // Esto elimina RegistroActivity del backstack

        }

    }
}
