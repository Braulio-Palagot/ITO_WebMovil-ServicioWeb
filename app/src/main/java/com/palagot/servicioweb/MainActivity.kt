package com.palagot.servicioweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var btnBuscar: MaterialButton
    private lateinit var btnLimpiar: MaterialButton
    private lateinit var btnSalir: MaterialButton

    private lateinit var txtNumeroControl: TextInputEditText
    private lateinit var txtNombre: TextInputEditText
    private lateinit var txtApellidoPaterno: TextInputEditText
    private lateinit var txtApellidoMaterno: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadComponents()
        setListeners()
    }

    private fun loadComponents() {
        btnBuscar = findViewById(R.id.btnBuscar)
        btnLimpiar = findViewById(R.id.btnLimpiar)
        btnSalir = findViewById(R.id.btnSalir)

        txtNumeroControl = findViewById(R.id.txtNumeroControl)
        txtNombre = findViewById(R.id.txtNombre)
        txtApellidoPaterno = findViewById(R.id.txtApellidoPaterno)
        txtApellidoMaterno = findViewById(R.id.txtApellidoMaterno)
    }

    private fun setListeners() {
        btnBuscar.setOnClickListener {
            buscarEstudiante()
        }

        btnLimpiar.setOnClickListener {
            txtNumeroControl.setText("")
            txtNombre.setText("")
            txtApellidoPaterno.setText("")
            txtApellidoMaterno.setText("")
        }

        btnSalir.setOnClickListener {
            System.exit(0)
        }
    }

    private fun buscarEstudiante() {
        
    }
}