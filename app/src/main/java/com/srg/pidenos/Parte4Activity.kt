package com.srg.pidenos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Parte4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parte4)

        findViewById<Button>(R.id.btn_Parte43).setOnClickListener {
            val intParte43 = Intent(this, Parte3Activity::class.java)
            startActivity(intParte43)
        }

        findViewById<Button>(R.id.btn_Parte45).setOnClickListener {
            val intParte45 = Intent(this, Parte5Activity::class.java)
            val nombre = findViewById<EditText>(R.id.edtxtNombre)
            val edad = findViewById<EditText>(R.id.edtxtEdad)

            if (!nombre.text.isNullOrEmpty() && !edad.text.isNullOrEmpty()){
                if (edad.text.toString().toInt() >= 18){
                    startActivity(intParte45)
                }else{
                    Toast.makeText(this, "El cliente debe ser mayor de edad", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "Debe rellenar toda la información", Toast.LENGTH_SHORT).show()
            }
        }
    }
}