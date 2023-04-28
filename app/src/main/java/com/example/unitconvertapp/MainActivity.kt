package com.example.unitconvertapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textV: TextView = findViewById(R.id.textView2)
        val edtNumber: EditText = findViewById(R.id.editTextNumber)
        val btn: Button = findViewById(R.id.button)

        btn.setOnClickListener {
            if (edtNumber.length() == 0) {
                textV.text  = "Informe um valor valido no campo acima!!"
            }
            val value: Int = convertValue(edtNumber.text.toString().toDouble())
            textV.text = value.toString()
        }
    }
    private fun convertValue(value: Double): Int {
        return ((value * 2.2 ) * 10).roundToInt() /10
    }
}