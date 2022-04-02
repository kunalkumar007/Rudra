package com.example.projectrudra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide();
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val signIn = findViewById<TextView>(R.id.textView4) as TextView

        signIn?.setOnClickListener{
            val intent = Intent(this, loginPage::class.java).apply {

            }
            startActivity(intent)
        }
    }
}