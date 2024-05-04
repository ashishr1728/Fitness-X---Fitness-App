package com.example.finalprojectcse225

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.widget.Button
import android.widget.ImageView

class SplashScreen4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen4)

        val start = findViewById<Button>(R.id.getStarted)
        val one = findViewById<ImageView>(R.id.first)
        val two = findViewById<ImageView>(R.id.second)
        val three = findViewById<ImageView>(R.id.third)

        start.setOnClickListener {
            val intent = Intent(this,CreateAccount::class.java)
            startActivity(intent)
            finish()
        }

        one.setOnClickListener {
            val intent = Intent(this,SplashScreen1::class.java)
            startActivity(intent)
        }

        two.setOnClickListener {
            val intent = Intent(this,SplashScreen2::class.java)
            startActivity(intent)
        }

        three.setOnClickListener {
            val intent = Intent(this,SplashScreen3::class.java)
            startActivity(intent)
        }
    }
}