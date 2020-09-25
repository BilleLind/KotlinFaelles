package com.example.kotlinflles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HvadErKotlin2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hvad_er_kotlin2)
        val videre: Button = findViewById(R.id.videreKotlin2)


        videre.setOnClickListener {
            startActivity(Intent(this, ProsAndCons::class.java))
        }
    }
}