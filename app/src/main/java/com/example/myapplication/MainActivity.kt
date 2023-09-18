package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var firstNumberInput: EditText
    lateinit var secondNumberInput: EditText
    lateinit var submitButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumberInput = findViewById(R.id.textInput1)
        secondNumberInput = findViewById(R.id.textInput2)
        submitButton = findViewById(R.id.button)


        submitButton.setOnClickListener(View.OnClickListener {
         Toast.makeText(this,firstNumberInput.text,Toast.LENGTH_SHORT).show()
        })
    }



}

private fun Button.setOnClickListener(mainActivity: MainActivity) {
    println()

}
