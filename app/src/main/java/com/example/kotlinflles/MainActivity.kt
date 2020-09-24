package com.example.kotlinflles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var county=1
        val increase = findViewById<Button>(R.id.increase)
        val count = findViewById<TextView>(R.id.count)

        increase.setOnClickListener {
            county +=1
            count.text = county.toString()
        }
    }
}