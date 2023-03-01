package com.example.upd_xipplg1_2991

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        button.setOnClickListener {
            val intent = Intent(this, room::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, facilities::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, gallery::class.java)
            startActivity(intent)
        }
    }
}