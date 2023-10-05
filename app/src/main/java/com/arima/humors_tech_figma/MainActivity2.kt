package com.arima.humors_tech_figma

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.temp)

        val Spinner:Spinner=findViewById(R.id.spinner)
        val branch :Array<String> = arrayOf("CSE","ECE", "IT ","Electrical")
        val adapter = ArrayAdapter(this,
            android.R.layout.simple_spinner_item, branch)
        val button:Button=findViewById(R.id.nextbtn)
        button.setOnClickListener(){
            val intent:Intent=Intent(this,Fragmentshandle::class.java)
            startActivity(intent)
        }

        Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>,
                                        view: View, position: Int, id: Long) {
                Toast.makeText(this@MainActivity2,
                    branch[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // write code to perform some action
                Toast.makeText(this@MainActivity2,"dasc",Toast.LENGTH_SHORT).show()
            }
        }
    }


    }
