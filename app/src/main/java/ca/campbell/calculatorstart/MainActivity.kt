package ca.campbell.calculatorstart

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

/**
 * Simple calculator, one entry field on the ui
 * One  button to add ( which displays input )
 *
 * @author PMCampbell
 * @version 1
 *
 **/
//  TODO: add a field to input a 2nd number, get the input and use it in calculations
//  TODO: the inputType attribute forces a number keyboard, don't use it on the second field so you can see the difference

//  TODO: add input validation: no divide by zero
//  TODO: input validation: set text to show error when it occurs

//  TODO: add a clear button that will clear the result & input fields

//  TODO: the hint for the result widget is hard coded, put it in the strings file

//  TODO: add buttons & methods for subtract, multiply, divide

class MainActivity : Activity() {
    // Get a handle on the views in the UI
    // lateinit allows us to avoid using null initialization & !! & ?
    // but we must be sure to init before use otherwise
    // it acts as if !! was used & crashes on null value
    private lateinit var etNum1: EditText
    private lateinit var result: TextView
    internal var total: Double = 0.toDouble()    // unused

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNum1 = findViewById(R.id.num1) as EditText
        result = findViewById(R.id.result) as TextView
    }  //onCreate()

    // TODO: replace with code that adds the two input numbers
    fun addNums(v: View) {
        result.text = ((etNum1.text.toString()).toDouble()).toString()
    }  //addNums()

}