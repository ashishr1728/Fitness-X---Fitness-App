package com.example.finalprojectcse225

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        val create = findViewById<Button>(R.id.create)
        val google = findViewById<ImageView>(R.id.google)
        val facebook = findViewById<ImageView>(R.id.facebook)
        val twitter = findViewById<ImageView>(R.id.twitter)
        val login = findViewById<TextView>(R.id.signin)
        val email = findViewById<TextView>(R.id.email)
        val password = findViewById<TextInputEditText>(R.id.password)

        create.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent.putExtra("email",email.text.toString())
                    .putExtra("password",password.text.toString()))
            Toast.makeText(applicationContext, "Account Created", Toast.LENGTH_LONG).show()
            finish()
        }

        google.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext, "Sign Up using Google", Toast.LENGTH_LONG).show()
            finish()
        }

        facebook.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext, "Sign Up using Facebook", Toast.LENGTH_LONG).show()
            finish()
        }

        twitter.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext, "Sign Up using Twitter", Toast.LENGTH_LONG).show()
            finish()
        }

        login.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }

    }
}