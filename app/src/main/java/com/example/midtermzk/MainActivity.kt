package com.example.midtermzk

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.isDigitsOnly


class MainActivity : AppCompatActivity() {

    lateinit var number: EditText
    lateinit var smstxt: EditText
    lateinit var SendButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        listeners()
    }

    private fun listeners(){
        SendButton.setOnClickListener {

            if (number.text.isEmpty() || smstxt.text.isEmpty() || smstxt.text.length > 250 || number.text.isDigitsOnly() == false){
                return@setOnClickListener
            }

            val getNumber = number.text.toString()
            val getTxtSms = smstxt.text.toString()

            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("number", getNumber)
            intent.putExtra("Smss", getTxtSms)
            startActivity(intent)

        }
    }

    private fun init() {
        number = findViewById(R.id.editTextPhone)
        smstxt = findViewById(R.id.textSmsWritten)
        SendButton = findViewById(R.id.SendButtonId)
    }

}