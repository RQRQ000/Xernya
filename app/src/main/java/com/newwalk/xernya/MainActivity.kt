package com.newwalk.xernya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var x : Float = 50F
    var y : Float = 50F
    var z :Float = 50F

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sum (V:View){
        x = first.text.toString().toFloat()
        y = second.text.toString().toFloat()
        z = x + y
        outresult.setText (z.toString())
    }
    fun otnat (V:View){
        x = first.text.toString().toFloat()
        y = second.text.toString().toFloat()
        z = x - y
        outresult.setText (z.toString())
    }
    fun proizvedenie (V:View){
        x = first.text.toString().toFloat()
        y = second.text.toString().toFloat()
        z = x * y
        outresult.setText (z.toString())
    }
    fun chastnoe (V:View){
        x = first.text.toString().toFloat()
        y = second.text.toString().toFloat()
        z = x / y
        outresult.setText (z.toString())
    }

}
