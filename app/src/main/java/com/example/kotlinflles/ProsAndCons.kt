package com.example.kotlinflles

import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.appcompat.app.AppCompatActivity


class ProsAndCons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pros_and_cons)
    }

    fun changeText():  {

        when(x){

            1 -> Toast.makeText(this, "- meget lignende Apple's swift, så nemt at hoppe mellem", LENGTH_LONG).show();
            2 -> Toast.makeText(this, "- jetbrains er selv igang med at lave \"Kotlin Multiplatform\" så man kan udvikle til android og ios", LENGTH_LONG).show();
            3 -> Toast.makeText(this, "- understøttet af mange IDE's så man kan arbejde i den man foretrækker", LENGTH_LONG).show();

            else -> {
                "test"
            }

        }


    }
    static void

}