package com.example.kotlinflles

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.appcompat.app.AppCompatActivity


class ProsAndCons : AppCompatActivity() {
    var x= 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pros_and_cons)
        val videre: Button = findViewById(R.id.viderePros)
        val next: Button = findViewById(R.id.Next_button)

        videre.setOnClickListener {
            startActivity(Intent(this, SimpleCalc::class.java))
        }

        next.setOnClickListener {
            x +=1;
            changeText()
        }

    }

    private fun changeText()  {

        when(x){

            1 -> Toast.makeText(this, "- meget lignende Apple's swift, så nemt at hoppe mellem", LENGTH_LONG).show();
            2 -> Toast.makeText(this, "- jetbrains er selv igang med at lave \"Kotlin Multiplatform\" så man kan udvikle til android og ios", LENGTH_LONG).show();
            3 -> Toast.makeText(this, "- understøttet af mange IDE's så man kan arbejde i den man foretrækker", LENGTH_LONG).show();
            4 -> Toast.makeText(this, "- meget klar og instinktiv syntaks, så nemt at skrive i:", LENGTH_LONG).show();
            5 -> Toast.makeText(this, "- godt til JVM development: desktop, web and backend server application", LENGTH_LONG).show();
            6 -> Toast.makeText(this, "- 20% færre fejl end at bruge java, og man slipper for en masse kildekode", LENGTH_LONG).show();

            else -> {
                Toast.makeText(this, "Okay, måske ikke så mange Pro's....", LENGTH_LONG).show();
            }

        }


    }

}