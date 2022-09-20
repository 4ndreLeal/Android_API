package com.Android_API

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val getName = intent.getStringExtra("ENTERED_NAME")
        val tvResult = findViewById<TextView>(R.id.tvResult)
        tvResult.text = getName
        val btReturn = findViewById<Button>(R.id.btReturn)
        btReturn.setOnClickListener {
            finish()
        }
    }
}
