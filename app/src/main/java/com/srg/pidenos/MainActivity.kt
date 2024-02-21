package com.srg.pidenos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_Parte2).setOnClickListener {
            val intParte2 = Intent(this, Parte2Activity::class.java)
            startActivity(intParte2)
        }

        findViewById<Button>(R.id.btn_Salir).setOnClickListener {
            finish()
        }
    }
}