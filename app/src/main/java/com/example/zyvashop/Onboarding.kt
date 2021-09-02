package com.example.zyvashop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val enter: Button = findViewById(R.id.button2)
        enter.setOnClickListener {
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
        }

    }
}