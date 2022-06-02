package com.example.proyecto_daise

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.editar_perfl)
        val user_name=findViewById<EditText>(R.id.user_name)
        val user_pass=findViewById<EditText>(R.id.user_pass)
        val new_pass=findViewById<TextView>(R.id.new_pass)
        val sign_in=findViewById<Button>(R.id.log_in)
        //AQUI VA EL INICIAR SESION//
        sign_in.setOnClickListener {
            val log_in = Intent(this, Home::class.java)
            startActivity(log_in)
        }
    }
}