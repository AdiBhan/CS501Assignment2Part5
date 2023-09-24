package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var firstNumberInput: EditText
    lateinit var secondNumberInput: EditText
    lateinit var submitButton: Button

    lateinit var additionRadioButton: RadioButton
    lateinit var subtractionRadioButton: RadioButton
    lateinit var multiplicationRadioButton: RadioButton
    lateinit var dividionRadioButton: RadioButton
    lateinit var radioGroup: RadioGroup
    lateinit var displayInit: TextView

    var sum:Float = 0F;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumberInput = findViewById(R.id.textInput1)
        secondNumberInput = findViewById(R.id.textInput2)
        submitButton = findViewById(R.id.button)

        additionRadioButton = findViewById(R.id.addition_id)
        subtractionRadioButton = findViewById(R.id.subtraction_id)
        multiplicationRadioButton = findViewById(R.id.multiplication_id)
        dividionRadioButton = findViewById(R.id.division_id)
        radioGroup = findViewById(R.id.radio_group)
        displayInit = findViewById(R.id.result_text)



        submitButton.setOnClickListener(View.OnClickListener {
            handleCalculate();

        })

    }

    @SuppressLint("SetTextI18n")
    fun handleCalculate() {
        /**
         * handCalculate function handles the logic for checking the operation
         * for first and second number and then performing proper operation, and
         * updating the displayed TextView to show the result.
         * SideNote: Function also checks to user errors, i.e.
         * make sure user didn't enter 0 as second number when dividing
         * */
        val firstNumber = firstNumberInput.text.toString().toFloatOrNull()
        val secondNumber = secondNumberInput.text.toString().toFloatOrNull()

        if (firstNumber != null && secondNumber != null) {
            when (radioGroup.checkedRadioButtonId) {
                R.id.addition_id -> {
                    sum = firstNumber + secondNumber
                }
                R.id.subtraction_id -> {
                    sum = firstNumber - secondNumber
                }
                R.id.multiplication_id -> {
                    sum = firstNumber * secondNumber
                }
                R.id.division_id -> {
                    if (secondNumber != 0F) {
                        sum = firstNumber / secondNumber
                    } else {
                        Toast.makeText(this, "Cannot divide by zero! Please change the second number", Toast.LENGTH_SHORT).show()
                        return  // Exit the function to avoid displaying the result
                    }
                }
                R.id.mod_id -> {
                    sum = firstNumber % secondNumber
                }
            }
           displayInit.text = "Result of the operation: " + sum.toString()
        } else {
            Toast.makeText(this, "Please enter valid number. Characters and symbols are not allowed. ", Toast.LENGTH_SHORT).show()
        }
        sum = 0F
    }

}


