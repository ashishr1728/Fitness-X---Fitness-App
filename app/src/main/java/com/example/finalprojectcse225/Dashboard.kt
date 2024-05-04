package com.example.finalprojectcse225

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val menu = findViewById<ImageView>(R.id.menu)
        val bellicon = findViewById<ImageView>(R.id.bellicon)
        val heart = findViewById<LinearLayout>(R.id.heartrate)
        val water = findViewById<LinearLayout>(R.id.water)
        val stress = findViewById<LinearLayout>(R.id.stress)
        val sleep = findViewById<LinearLayout>(R.id.sleep)
        val steps = findViewById<LinearLayout>(R.id.step)
        val spo2 = findViewById<LinearLayout>(R.id.spo2)
        val home = findViewById<ImageView>(R.id.home)
        val workout = findViewById<ImageView>(R.id.workout)
        val calender = findViewById<ImageView>(R.id.calender)
        val diet = findViewById<ImageView>(R.id.diet)
        val profile = findViewById<ImageView>(R.id.profile)

        menu.setOnClickListener {
            val intent = Intent(this, InternalStorage::class.java)
            startActivity(intent)
        }

        bellicon.setOnClickListener {
            val intent = Intent(this, ViewPager::class.java)
            startActivity(intent)
        }

        heart.setOnClickListener {
            val intent = Intent(this, HeartRate::class.java)
            startActivity(intent)
        }

        water.setOnClickListener {
            val intent = Intent(this, Water::class.java)
            startActivity(intent)
        }

        stress.setOnClickListener {
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }

        sleep.setOnClickListener {
            val intent = Intent(this, Sleep::class.java)
            startActivity(intent)
        }

        steps.setOnClickListener {
            val intent = Intent(this, Steps::class.java)
            startActivity(intent)
        }

        spo2.setOnClickListener {
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }

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