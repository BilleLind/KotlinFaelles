package com.example.kotlinflles

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinflles.HvadErKotlin as HvadErKotlin1

class HelloWorld : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)
        val videre: Button = findViewById(R.id.videreHello)

        videre.setOnClickListener {
            startActivity(Intent(this, HvadErKotlin1::class.java))
        }



    }
}