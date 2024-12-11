package com.example.ManejoDeLuces // Cambia según tu package name

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.example.evaluacion4.R

class MainActivity : AppCompatActivity() {
    private lateinit var connectionStatus: TextView
    private lateinit var lightStatus: TextView
    private lateinit var buttonOn: Button
    private lateinit var buttonOff: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectionStatus = findViewById(R.id.connection_status)
        lightStatus = findViewById(R.id.light_status)
        buttonOn = findViewById(R.id.button_on)
        buttonOff = findViewById(R.id.button_off)

        buttonOn.setOnClickListener {
            lightStatus.text = "Luces Encendidas"
            connectionStatus.text = "Conectado"
            connectionStatus.setTextColor(resources.getColor(android.R.color.holo_green_dark))
        }

        buttonOff.setOnClickListener {
            lightStatus.text = "Luces Apagadas"
            connectionStatus.text = "Conectado"
            connectionStatus.setTextColor(resources.getColor(android.R.color.holo_red_dark))
        }
    }
}