package com.srg.pidenos

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class Parte5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parte5)

        var reservas = ArrayList<String>()
        val dias = resources.getStringArray(R.array.diasSemana)
        val lugar = resources.getStringArray(R.array.lugar)
        val lstvReservas = findViewById<ListView>(R.id.lstvReservas)

        // Accediendo a los spinners
        val spndias = findViewById<Spinner>(R.id.spnDiaSemana)
        val spnlugar = findViewById<Spinner>(R.id.spnLugar)
        if (spndias != null && spnlugar != null) {
            var adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, dias)
            spndias.adapter = adapter
            adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, lugar)
            spnlugar.adapter = adapter
        }

        //Boton de guardar
        findViewById<Button>(R.id.btn_Guardar).setOnClickListener {

            val spnDiaSeleccionado = spndias.selectedItem.toString()
            val spnLugarSeleccionado = spnlugar.selectedItem.toString()
            reservas.add(spnDiaSeleccionado + " - " + spnLugarSeleccionado)
            actualizarReservas(reservas, lstvReservas)
        }

        //Boton de borrar
        findViewById<Button>(R.id.btn_Borrar).setOnClickListener {
            reservas.clear()
            actualizarReservas(reservas, lstvReservas)
        }

        //Boton de regresar a la parte 4
        findViewById<Button>(R.id.btn_Parte54).setOnClickListener {
            val intParte54 = Intent(this, Parte4Activity::class.java)
            startActivity(intParte54)
        }

    }

    private fun actualizarReservas(reservas: ArrayList<String>, lstvReservas: ListView) {
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, reservas)
        lstvReservas.adapter = adaptador1
    }
}