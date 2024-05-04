package com.example.finalprojectcse225

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TimePicker
import android.widget.Toast

class Alarm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)
        var hours = 0
        var min = 0

        val timePicker = findViewById<TimePicker>(R.id.timePicker)

        timePicker.setOnTimeChangedListener { _, hour, minute ->
            var hour = hour
            var am_pm = ""
            // AM_PM decider logic
            when {
                hour == 0 -> {
                    hour += 12
                    am_pm = "AM"
                }

                hour == 12 -> am_pm = "PM"
                hour > 12 -> {
                    hour -= 12
                    am_pm = "PM"
                }

                else -> am_pm = "AM"
            }


            hours = hour
            min = minute
        }
            val back = findViewById<ImageView>(R.id.back)
        val set = findViewById<Button>(R.id.set)
        val stop = findViewById<Button>(R.id.stop)
        val home = findViewById<ImageView>(R.id.home)
        val workout = findViewById<ImageView>(R.id.workout)
        val calender = findViewById<ImageView>(R.id.calender)
        val diet = findViewById<ImageView>(R.id.diet)
        val profile = findViewById<ImageView>(R.id.profile)

        back.setOnClickListener{
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

        var alarmManager:AlarmManager

        val intent = Intent(this, AlarmManagerBroadcast::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this,224,intent,PendingIntent.FLAG_UPDATE_CURRENT)

        set.setOnClickListener {
            val i = hours*3600 + min*60
            val diff = ((i*1000) - System.currentTimeMillis())/1000
            alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
            alarmManager.set(AlarmManager.RTC_WAKEUP,(i*1000) - System.currentTimeMillis(),pendingIntent)
            Toast.makeText(this,"Alarm in $diff seconds",Toast.LENGTH_SHORT).show()
        }

        stop.setOnClickListener {
            alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
            alarmManager.cancel(pendingIntent)
            Toast.makeText(this,"Alarm cancelled",Toast.LENGTH_SHORT).show()
        }
    }
}