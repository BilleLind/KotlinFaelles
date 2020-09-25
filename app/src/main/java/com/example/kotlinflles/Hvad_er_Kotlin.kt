package com.example.kotlinflles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout

class Hvad_er_Kotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hvad_er__kotlin)
        val next: Button = findViewById(R.id.hvaderkotlin)

        next.setOnClickListener {
            startActivity(Intent(this, HvadErKotlin2::class.java))

        }
    }
}