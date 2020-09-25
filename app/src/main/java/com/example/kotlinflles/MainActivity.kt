package com.example.kotlinflles

import android.annotation.SuppressLint
import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var county=1
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val increase = findViewById<Button>(R.id.increase)
        val count: TextView = findViewById(R.id.count)
        val videre: Button = findViewById(R.id.videre)
        val layout:RelativeLayout = findViewById(R.id.mainLayout);
        increase.setOnClickListener {
            change()
            val temp:String = county.toString()
            count.setText(temp)
            Toast.makeText(applicationContext, hentSvar(), Toast.LENGTH_SHORT).show()
        }
        videre.setOnClickListener {
            startActivity(Intent(this, HelloWorld::class.java))
        }

        layout.setOnTouchListener(object: OnSwipeTouchListener(this@MainActivity) {
            override fun  onSwipeLeft(){
            toRight()
            }
        })

    }

    fun toRight() {
        startActivity(Intent(this, HelloWorld::class.java))
    }

    fun change() {
        county += 1
    }
    fun hentSvar() : String {
        val svar = when {
            county ==5 -> "så nåede vi 5"
            county <6 -> "så er det bare fremad"
            county == 10 -> "yeah 10"
            else -> "mon jeg virker" }
        return svar
    }

}