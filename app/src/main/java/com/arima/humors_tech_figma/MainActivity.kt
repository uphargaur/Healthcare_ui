package com.arima.humors_tech_figma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val backbtn:ImageButton=findViewById(R.id.back_button)
        val forwardbtn:ImageButton=findViewById(R.id.forwardbutton)
        val viewfullanalysis:TextView=findViewById(R.id.textView3_view)

        backbtn.setOnClickListener()
        {
            maketoast("Back button is pressed")
        }
        forwardbtn.setOnClickListener()
        {
            maketoast("forward button is pressed")
        }
        viewfullanalysis.setOnClickListener()
        {
            maketoast("View full details ")
        }


    }
    fun maketoast(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show()
    }
}