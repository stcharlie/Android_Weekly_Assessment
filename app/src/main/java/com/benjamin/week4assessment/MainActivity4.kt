package com.benjamin.week4assessment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    private lateinit var btnCall : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        btnCall = findViewById(R.id.btnCall)

        btnCall.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL)
            intent.setData((Uri.parse("tel:08134552088")))
            startActivity(intent)
        }
    }
}