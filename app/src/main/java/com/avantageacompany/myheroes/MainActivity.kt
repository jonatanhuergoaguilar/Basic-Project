package com.avantageacompany.myheroes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testButton = findViewById<AppCompatButton>(R.id.simpleButton)
        val editText = findViewById<AppCompatEditText>(R.id.etName)

        testButton.setOnClickListener {
            val nameOf = editText.text.toString()

            if (nameOf.isNotEmpty()){
                val intent = Intent(this,ResultActivity::class.java)
                intent.putExtra("Extra_Name", nameOf)
                startActivity(intent)
            }

        }
    }
}