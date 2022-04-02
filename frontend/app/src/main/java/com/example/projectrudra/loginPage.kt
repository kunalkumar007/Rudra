package com.example.projectrudra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent

class loginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide();
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val signUp = findViewById<TextView>(R.id.textView6) as TextView
        signUp?.setOnClickListener{
            val Intent = Intent(this,MainActivity::class.java).apply {

            }
            startActivity(Intent)
        }
    }
}