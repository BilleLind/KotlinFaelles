package com.example.kotlinflles

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class HelloWorld : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)
        val layout: RelativeLayout = findViewById(R.id.helloWorld);

        val videre: Button = findViewById(R.id.videre_til_simple_calc)

        videre.setOnClickListener {
            startActivity(Intent(this, HvadErKotlin2::class.java))
        }


        layout.setOnTouchListener(object: OnSwipeTouchListener(this@HelloWorld) {
            override fun  onSwipeLeft(){
                toRight()
            }
        })
    }

    fun toRight() {
        startActivity(Intent(this, SimpleCalc::class.java))
    }
}