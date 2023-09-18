package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var firstNumberInput: EditText
    lateinit var secondNumberInput: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumberInput = findViewById(R.id.textInput1)
        secondNumberInput = findViewById(R.id.textInput2)
    }

}