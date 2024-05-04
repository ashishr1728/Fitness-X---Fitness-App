package com.example.finalprojectcse225

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.widget.ImageView

class SplashScreen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen1)

        val next = findViewById<ImageView>(R.id.next)
        val two = findViewById<ImageView>(R.id.second)
        val three = findViewById<ImageView>(R.id.third)
        val four = findViewById<ImageView>(R.id.fourth)

        next.setOnClickListener {
            val intent = Intent(this,SplashScreen2::class.java)
            startActivity(intent)
        }

        four.setOnClickListener {
            val intent = Intent(this,SplashScreen4::class.java)
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

        android.os.Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, SplashScreen2::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}