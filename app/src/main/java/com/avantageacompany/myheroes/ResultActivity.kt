package com.avantageacompany.myheroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val textResult = findViewById<TextView>(R.id.txtResult)
        val names : String = intent.extras?.getString("Extra_Name").orEmpty()
        textResult.text = "Hello $names"
    }
}