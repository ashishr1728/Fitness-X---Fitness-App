package com.example.finalprojectcse225

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val create = findViewById<Button>(R.id.login)
        val google = findViewById<ImageView>(R.id.google)
        val facebook = findViewById<ImageView>(R.id.facebook)
        val twitter = findViewById<ImageView>(R.id.twitter)
        val signin = findViewById<TextView>(R.id.signin)
        val email = findViewById<TextView>(R.id.edited_email)
        val password = findViewById<TextView>(R.id.edited_password)

        email.text = intent.getStringExtra("email")
        password.text = intent.getStringExtra("password")

        create.setOnClickListener {
            Toast.makeText(applicationContext, "Login Successfully", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
            finish()
        }

        google.setOnClickListener {
            Toast.makeText(applicationContext, "Sign In using Google", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
            finish()
        }

        facebook.setOnClickListener {
            Toast.makeText(applicationContext, "Sign In using Facebook", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
            finish()
        }

        twitter.setOnClickListener {
            Toast.makeText(applicationContext, "Sign In using Twitter", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
            finish()
        }

        signin.setOnClickListener {
            val intent = Intent(this, CreateAccount::class.java)
            startActivity(intent)
            finish()
        }

    }
}