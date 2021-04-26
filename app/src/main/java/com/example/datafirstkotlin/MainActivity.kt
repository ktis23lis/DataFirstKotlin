package com.example.datafirstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

     lateinit var tv : TextView
     lateinit var btn : Button
     lateinit var tv2 : TextView
     val person = Person("Human ", "Humanov")
     var person2 = person.copy()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        initTextView(person)
        initButton(btn)
    }

    private fun init (){
        tv = findViewById(R.id.textView)
        btn = findViewById(R.id.button)
        tv2 = findViewById(R.id.textView2)
    }

    private fun initTextView(p: Person){
        tv.text = p.firstName + " "+ p.lastName
    }

    private fun initButton(btn: Button){
        btn.setOnClickListener{
        tv2.text = person2.firstName + " " + person2.lastName
        }
    }






}