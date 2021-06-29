package com.benjamin.week4assessment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var userName: EditText
    private lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userName=findViewById(R.id.userName)
        password=findViewById(R.id.password)

        val activityTwoButton = findViewById(R.id.button2) as Button
        activityTwoButton.setOnClickListener{
            val userName=userName.text.toString()
            val password1=password.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }
        val activity1Button = findViewById(R.id.button1) as Button
        activity1Button.setOnClickListener{
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}