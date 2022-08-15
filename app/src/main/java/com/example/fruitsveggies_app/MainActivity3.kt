package com.example.fruitsveggies_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        findViewById<CardView>(R.id.cardView1).setOnClickListener {
            startActivity(Intent(this, MarketFeed::class.java))

        }
        findViewById<CardView>(R.id.cardView2).setOnClickListener{
            startActivity(Intent(this,MarketFeed::class.java))
        }


    }

}
