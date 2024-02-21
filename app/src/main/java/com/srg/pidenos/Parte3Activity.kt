package com.srg.pidenos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Parte3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parte3)

        findViewById<Button>(R.id.btn_Parte32).setOnClickListener {
            val intParte32 = Intent(this, Parte2Activity::class.java)
            startActivity(intParte32)
        }

        findViewById<Button>(R.id.btn_Parte34).setOnClickListener {
            val intParte34 = Intent(this, Parte4Activity::class.java)
            startActivity(intParte34)
        }
    }
}