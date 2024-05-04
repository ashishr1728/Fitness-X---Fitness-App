package com.example.finalprojectcse225

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView
import java.util.logging.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val backgroundImage: ImageView = findViewById(R.id.logo)
        val slideAnimation = AnimationUtils.loadAnimation(this, R.anim.side_slide)
        backgroundImage.startAnimation(slideAnimation)

        android.os.Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, SplashScreen1::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}