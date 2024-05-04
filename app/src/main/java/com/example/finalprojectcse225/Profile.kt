package com.example.finalprojectcse225

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val back = findViewById<ImageView>(R.id.back)
        val profile1 = findViewById<TextView>(R.id.profile1)
        val profile_icon = findViewById<ImageView>(R.id.profil_icon)
        val profile_image = findViewById<ImageView>(R.id.profile_image)
        val home = findViewById<ImageView>(R.id.home)
        val workout = findViewById<ImageView>(R.id.workout)
        val calender = findViewById<ImageView>(R.id.calender)
        val diet = findViewById<ImageView>(R.id.diet)
        val profile = findViewById<ImageView>(R.id.profile)
        val contact_image = findViewById<ImageView>(R.id.contact_image)
        val contact_text = findViewById<TextView>(R.id.contact_text)
        val image_about = findViewById<ImageView>(R.id.image_about)
        val text_about = findViewById<TextView>(R.id.text_about)
        val image_privacy = findViewById<ImageView>(R.id.image_privacy)
        val text_privacy = findViewById<TextView>(R.id.text_privacy)
        val image_logout = findViewById<ImageView>(R.id.image_logout)
        val text_logout = findViewById<TextView>(R.id.text_logout)
        val image_timetable = findViewById<ImageView>(R.id.image_timetable)
        val text_timetable = findViewById<TextView>(R.id.text_timetable)

        contact_image.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:+919328046344")
            startActivity(intent)
        }
        contact_text.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:+919328046344")
            startActivity(intent)
        }

        image_timetable.setOnClickListener{
            val intent = Intent(this,Calender::class.java)
            startActivity(intent)
        }

        text_timetable.setOnClickListener{
            val intent = Intent(this,Calender::class.java)
            startActivity(intent)
        }

        image_about.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://goldsgym.in/"))
            startActivity(intent)
        }

        text_about.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://goldsgym.in/"))
            startActivity(intent)
        }

        image_privacy.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.plusfitness.co.in/privacy-policy/"))
            startActivity(intent)
        }

        text_privacy.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.plusfitness.co.in/privacy-policy/"))
            startActivity(intent)
        }

        image_logout.setOnClickListener{
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }

        text_logout.setOnClickListener{
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }

        back.setOnClickListener{
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }

        profile1.setOnClickListener{
            val intent = Intent(this, ProfileDetails::class.java)
            startActivity(intent)
        }
        profile_icon.setOnClickListener{
            val intent = Intent(this, ProfileDetails::class.java)
            startActivity(intent)
        }
        profile_image.setOnClickListener{
            val intent = Intent(this, ProfileDetails::class.java)
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