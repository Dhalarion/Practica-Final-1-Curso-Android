package com.srg.pidenos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Parte2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parte2)

        findViewById<Button>(R.id.btn_Parte21).setOnClickListener {
            val intParte21 = Intent(this, MainActivity::class.java)
            startActivity(intParte21)
        }

        findViewById<Button>(R.id.btn_Parte23).setOnClickListener {
            val intParte23 = Intent(this, Parte3Activity::class.java)
            startActivity(intParte23)
        }
    }
}