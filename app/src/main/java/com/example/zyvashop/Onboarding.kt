package com.example.zyvashop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val enter: Button = findViewById(R.id.btn_email)
        enter.setOnClickListener {
            intent = Intent(this,LoginEmail::class.java)
            startActivity(intent)
            finish()
        }



    }
}