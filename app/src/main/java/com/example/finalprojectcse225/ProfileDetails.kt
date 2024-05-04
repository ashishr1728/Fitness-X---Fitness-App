package com.example.finalprojectcse225

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ProfileDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_details)

        val back = findViewById<ImageView>(R.id.back)
        val image = findViewById<ImageView>(R.id.image)
        val change = findViewById<TextView>(R.id.change)
        val username = findViewById<TextView>(R.id.username)
        val email = findViewById<TextView>(R.id.email)
        val mobile = findViewById<TextView>(R.id.mobile)
        val address = findViewById<TextView>(R.id.adress)
        val gender = findViewById<TextView>(R.id.gender)
        val dob = findViewById<TextView>(R.id.dob)
        val age = findViewById<TextView>(R.id.age)
        val city = findViewById<TextView>(R.id.city)
        val state = findViewById<TextView>(R.id.state)
        val country = findViewById<TextView>(R.id.country)
        val share = findViewById<ImageView>(R.id.share)
        val edit = findViewById<Button>(R.id.edit)


        username.text = intent.getStringExtra("username")
        email.text = intent.getStringExtra("email")
        mobile.text = intent.getStringExtra("mobile")
        address.text = intent.getStringExtra("address")
        gender.text = intent.getStringExtra("gender")
        dob.text = intent.getStringExtra("dob")
        age.text = intent.getStringExtra("age")
        city.text = intent.getStringExtra("city")
        state.text = intent.getStringExtra("state")
        country.text = intent.getStringExtra("country")

        change.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_PICK_IMAGES)
            startActivity(intent)
        }

        image.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_PICK_IMAGES)
            startActivity(intent)
        }

        share.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share Via")
                .putExtra("username",username.text.toString())
                .putExtra("email",email.text.toString())
                .putExtra("mobile",mobile.text.toString())
                .putExtra("address",address.text.toString())
                .putExtra("gender",gender.text.toString())
                .putExtra("dob",dob.text.toString())
                .putExtra("age",age.text.toString())
                .putExtra("city",city.text.toString())
                .putExtra("state",state.text.toString())
                .putExtra("country",country.text.toString()))
        }

        back.setOnClickListener{
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        edit.setOnClickListener {
            val intent = Intent(this, EditProfile::class.java)
            startActivity(intent)
        }


    }
}