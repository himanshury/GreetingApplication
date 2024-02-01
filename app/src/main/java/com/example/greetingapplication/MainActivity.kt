package com.example.greetingapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn= findViewById<Button>(R.id.button)

        btn.setOnClickListener()
        {
            val editTxt= findViewById<EditText>(R.id.editTextText)
            var name= editTxt.text

            Toast.makeText(this,
                "Hello $name",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}