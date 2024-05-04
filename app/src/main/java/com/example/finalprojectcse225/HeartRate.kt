package com.example.finalprojectcse225

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout

class HeartRate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heart_rate)

        val back = findViewById<ImageView>(R.id.back)
        val heartanim = findViewById<LinearLayout>(R.id.heartanim)
        val bpm = findViewById<LinearLayout>(R.id.bpm)

        val rotate = AnimationUtils.loadAnimation(this,R.anim.rotate)
        heartanim.animation = rotate

        val anti_clockwise = AnimationUtils.loadAnimation(this,R.anim.anticlock_rotation)
        bpm.animation = anti_clockwise

        back.setOnClickListener{
            val intent = Intent(this,Dashboard::class.java)
            startActivity(intent)
        }

        val home = findViewById<ImageView>(R.id.home)
        val workout = findViewById<ImageView>(R.id.workout)
        val calender = findViewById<ImageView>(R.id.calender)
        val diet = findViewById<ImageView>(R.id.diet)
        val profile = findViewById<ImageView>(R.id.profile)

        home.setOnClickListener {
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }

        workout.setOnClickListener {
            val intent = Intent(this, Workout::class.java)
            startActivity(intent)
        }

        calender.setOnClickListener {
            val intent = Intent(this, Calender::class.java)
            startActivity(intent)
        }

        diet.setOnClickListener {
            val intent = Intent(this, Diet::class.java)
            startActivity(intent)
        }

        profile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}