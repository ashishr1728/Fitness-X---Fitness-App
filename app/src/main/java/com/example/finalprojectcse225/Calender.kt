package com.example.finalprojectcse225

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.ImageView
import android.widget.Toast
import java.util.Calendar

class Calender : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calender)
        supportFragmentManager.beginTransaction().replace(R.id.frame,DatePickerFragment()).commit()

        val back = findViewById<ImageView>(R.id.back)
        val next = findViewById<Button>(R.id.next)
        val home = findViewById<ImageView>(R.id.home)
        val workout = findViewById<ImageView>(R.id.workout)
        val calender = findViewById<ImageView>(R.id.calender)
        val diet = findViewById<ImageView>(R.id.diet)
        val profile = findViewById<ImageView>(R.id.profile)

        back.setOnClickListener{
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }

        var count = 0;

        next.setOnClickListener{
            if(count == 0){
                supportFragmentManager.beginTransaction().replace(R.id.frame,TimePickerFragment()).commit()
                next.text = "Set Alarm"
                count++
            }
            else{
                val intent = Intent(this, Alarm::class.java)
                startActivity(intent)
            }
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