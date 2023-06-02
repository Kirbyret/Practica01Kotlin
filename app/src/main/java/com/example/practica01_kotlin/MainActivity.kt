package com.example.practica01_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // Creacion de variables
    private lateinit var btnPulsar: Button
    private lateinit var txtNombre: EditText
    private lateinit var lblSaludar: TextView
    private lateinit var btnLimpiar: Button
    private lateinit var btnCerrar: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Relacionar los componentes
        btnPulsar = findViewById(R.id.btnSaludar)
        txtNombre = findViewById(R.id.txtNombre)
        lblSaludar = findViewById(R.id.lblSaludo)
        btnLimpiar = findViewById(R.id.btnLimpiar)
        btnCerrar = findViewById(R.id.btnCerrar)

        btnPulsar.setOnClickListener {
            // Validar
            if (txtNombre.text.toString().isEmpty()) {
                Toast.makeText(this@MainActivity, "Falto capturar información", Toast.LENGTH_SHORT).show()
            } else {
                val str = "Hola ${txtNombre.text}, ¿cómo estás?"
                lblSaludar.text = str
            }
        }

        // Evento click del botón Limpiar
        btnLimpiar.setOnClickListener {
            lblSaludar.text = ":: ::"
            txtNombre.text.clear()
        }

        // Evento click del botón Cerrar
        btnCerrar.setOnClickListener {
            finish()
        }


    }

}