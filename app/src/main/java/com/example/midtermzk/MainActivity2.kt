package com.example.midtermzk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {

    lateinit var phone2 : EditText
    lateinit var smsTxt2 : EditText
    lateinit var ClearButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        init()
        listeners()
        set_TextToSms()
    }

    fun set_TextToSms(){
        val intent = getIntent()
        val getName = intent.getStringExtra("Smss");
        val getNumber = intent.getStringExtra("number");

        //Set Text
        phone2.setText(getNumber);
        smsTxt2.setText(getName);

    }

    private fun listeners(){
        ClearButton.setOnClickListener {
        smsTxt2.text.clear()
        phone2.text.clear()
     }
    }

    private fun init(){
        phone2= findViewById(R.id.editTextPhone2)
        smsTxt2 = findViewById(R.id.ReceivedSms)
        ClearButton = findViewById(R.id.ClearButton)
   }


}