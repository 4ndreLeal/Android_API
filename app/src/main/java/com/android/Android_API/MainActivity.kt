package com.Android_API

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btSend = findViewById<Button>(R.id.btSend)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val etName = findViewById<EditText>(R.id.etName)
        btSend.setOnClickListener {
            val name = etName.text
            if (name.isNotBlank()) {
                tvResult.text = name
            } else {
                etName.error = "Enter a valid name!"
            }
        }
        
        val btOpenNewScreen = findViewById<Button>(R.id.btOpenNewScreen)
        btOpenNewScreen.setOnClickListener {
            val intentNewScreen = Intent(this, ResultActivity::class.java)
            val getName = etName.text.toString()
            intentNovaTela.putExtra("ENTERED NAME", getName)
            startActivity(intentNewScreen)
        }
    }
}
