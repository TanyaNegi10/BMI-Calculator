package com.taniya.bmicalci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var h=findViewById<EditText>(R.id.height)
        val w=findViewById<EditText>(R.id.weight)
        val cal=findViewById<Button>(R.id.cal)
        val bmi=findViewById<TextView>(R.id.bmi)
        val status=findViewById<TextView>(R.id.status)

        cal.setOnClickListener {
            var ht=h.text.toString().toFloat()
            val wt=w.text.toString().toFloat()

            ht=ht/100
            val ans = wt / (ht * ht)
            bmi.text="BMI is $ans"
            if(ans<18.5)
            {
                status.text="(Underweight)"
            }
            else if(18.5<=ans && ans<=24.9)
            {
                status.text="(Normal)"
            }
            else if(25.0<=ans && ans<=29.9)
            {
                status.text="(Overweight)"
            }
            else if(30.0<=ans && ans<=34.9){
                status.text="(Obese)"
            }
            else{
                status.text="(Extremely Obese"
            }
        }
    }
}