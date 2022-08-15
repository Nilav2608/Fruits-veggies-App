package com.example.fruitsveggies_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         findViewById<ImageButton>(R.id.imageButtonArrow).setOnClickListener{
             startActivity(Intent(this,MainActivity2::class.java))
         }

      }
}



