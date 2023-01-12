package com.example.myapplication

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button =findViewById<Button>(R.id.button)
        val button2 =findViewById<Button>(R.id.button2)
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
        var color = arrayOf(
            "azul", "rosa", "gris"
        )
        val customDialog=AlertDialog.Builder(this)
        customDialog.setTitle("Dialogo")
        customDialog.setItems(color,DialogInterface.OnClickListener{
            _,which ->
            when(which){
                0->{
                    Toast.makeText(this, "Azul", Toast.LENGTH_LONG).show()
                }
                1 ->{
                    Toast.makeText(this, "Rosa", Toast.LENGTH_LONG).show()
                }
                2->{
                    Toast.makeText(this, "gris", Toast.LENGTH_LONG).show()
                }
            }
        })
        val alertDialog=customDialog.create()
        alertDialog.setCancelable(false)
        alertDialog.show()
    }
}