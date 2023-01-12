package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button =findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val builder = AlertDialog.Builder(this)

            builder.setTitle("Notificacian abierta")

            builder.setMessage("Estas dentro de una ")
            builder.setIcon(android.R.drawable.ic_dialog_alert)
            builder.setPositiveButton("Si") { dialogInterface, which ->
                Toast.makeText(applicationContext, "Aceptar", Toast.LENGTH_LONG).show()
            }
            builder.setNeutralButton("Cancel") { dialogInterface, which ->
                Toast.makeText(applicationContext, "Cancelar Operacion", Toast.LENGTH_LONG).show()
            }
            builder.setNegativeButton("No") { dialogInterface, which ->
                Toast.makeText(applicationContext, "Denegar", Toast.LENGTH_LONG).show()
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()

        }
    }
}