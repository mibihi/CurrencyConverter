package com.example.mibihi.currencyconverter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_converter.*
import org.w3c.dom.Text

class ConverterActivity : AppCompatActivity() {
    val rate:Double = .87
    public fun convertCurrency(v:View) {
       val edittext = findViewById<EditText>(R.id.txtAmt) as EditText
       val amounttoconvert = edittext.text.toString()
        var amt: Double = amounttoconvert.toDouble()
        var amttodisplay:Double = amt * rate
        val myToast = Toast.makeText(this,amttodisplay.toString(),Toast.LENGTH_LONG)
        myToast.show()
        Log.i(  "info",amttodisplay.toString())

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter)



    }
}
