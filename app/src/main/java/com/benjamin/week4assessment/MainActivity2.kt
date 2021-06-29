package com.benjamin.week4assessment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var fullName:EditText
    private lateinit var password1:EditText
    private lateinit var email:EditText
    private lateinit var phoneNumber:EditText
    private lateinit var register:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        fullName=findViewById(R.id.fullName)
        password1=findViewById(R.id.password1)
        email=findViewById(R.id.email)
        phoneNumber=findViewById(R.id.phoneNumber)
        register=findViewById(R.id.register)




        register.setOnClickListener{
            val fullName=fullName.text.toString()
            val password1=password1.text.toString()
            val email=email.text.toString()
            val phoneNumber=phoneNumber.text.toString()
        }


            register.setOnClickListener{
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
    }

}
}


