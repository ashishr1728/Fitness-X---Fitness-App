package com.example.finalprojectcse225

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.finalprojectcse225.databinding.ActivityMainBinding
import java.util.Calendar

class Workout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout)

        val id = arrayOf(R.id.one,R.id.two,R.id.three,R.id.four,R.id.five,R.id.six,R.id.seven,R.id.eight,R.id.nine,R.id.ten,R.id.eleven,R.id.twelve,R.id.thirteen,R.id.fourteen,R.id.fifteen)

        val calender1 = Calendar.getInstance()
//        val year = calender.get(Calendar.YEAR)
//        val month = calender.get(Calendar.MONTH) + 1
        val day = calender1.get(Calendar.DAY_OF_MONTH)
//        val date = "$year-$month-$day"

        if(day == 1 || day == 8 || day == 15){
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,WedWorkoutFragment())
            transition.commit()
            var id1 = findViewById<LinearLayout>(id[day-1])
            id1.background = resources.getDrawable(R.drawable.light_blue_box)
        }
        else if(day == 2 || day == 9){
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,ThruWorkoutFragment())
            var id1 = findViewById<LinearLayout>(id[day-1])
            id1.background = resources.getDrawable(R.drawable.light_blue_box)
            transition.commit()

        }
        else if(day == 3 || day == 10){
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,FriWorkoutFragment())
            transition.commit()
            var id1 = findViewById<LinearLayout>(id[day-1])
            id1.background = resources.getDrawable(R.drawable.light_blue_box)
        }
        else if(day == 4 || day == 11){
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,SatWorkoutFragment())
            transition.commit()
            var id1 = findViewById<LinearLayout>(id[day-1])
            id1.background = resources.getDrawable(R.drawable.light_blue_box)
        }
        else if(day == 5 || day == 12){
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,SunWorkoutFragment())
            transition.commit()
            var id1 = findViewById<LinearLayout>(id[day-1])
            id1.background = resources.getDrawable(R.drawable.light_blue_box)
        }
        else if(day == 6 || day == 13){
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,MonWorkoutFragment())
            transition.commit()
            var id1 = findViewById<LinearLayout>(id[day-1])
            id1.background = resources.getDrawable(R.drawable.light_blue_box)
        }
        else if(day == 7 || day == 14){
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,TueWorkoutFragment())
            transition.commit()
            var id1 = findViewById<LinearLayout>(id[day-1])
            id1.background = resources.getDrawable(R.drawable.light_blue_box)
        }

        val one = findViewById<LinearLayout>(R.id.one)
        val two = findViewById<LinearLayout>(R.id.two)
        val three = findViewById<LinearLayout>(R.id.three)
        val four = findViewById<LinearLayout>(R.id.four)
        val five = findViewById<LinearLayout>(R.id.five)
        val six = findViewById<LinearLayout>(R.id.six)
        val seven = findViewById<LinearLayout>(R.id.seven)
        val eight = findViewById<LinearLayout>(R.id.eight)
        val nine = findViewById<LinearLayout>(R.id.nine)
        val ten = findViewById<LinearLayout>(R.id.ten)
        val eleven = findViewById<LinearLayout>(R.id.eleven)
        val twelve = findViewById<LinearLayout>(R.id.twelve)
        val thirteen = findViewById<LinearLayout>(R.id.thirteen)
        val fourteen = findViewById<LinearLayout>(R.id.fourteen)
        val fifteen = findViewById<LinearLayout>(R.id.fifteen)
        val home = findViewById<ImageView>(R.id.home)
        val workout = findViewById<ImageView>(R.id.workout)
        val calender = findViewById<ImageView>(R.id.calender)
        val diet = findViewById<ImageView>(R.id.diet)
        val profile = findViewById<ImageView>(R.id.profile)
        val back = findViewById<ImageView>(R.id.back)

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


        one.setOnClickListener{
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,WedWorkoutFragment())
            transition.commit()
//            one.background = resources.getDrawable(R.drawable.light_blue_box)
        }
        two.setOnClickListener{
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,ThruWorkoutFragment())
            transition.commit()
//            two.background = resources.getDrawable(R.drawable.light_blue_box)
        }
        three.setOnClickListener{
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,FriWorkoutFragment())
            transition.commit()
//            three.background = resources.getDrawable(R.drawable.light_blue_box)
        }
        four.setOnClickListener{
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,SatWorkoutFragment())
            transition.commit()
//            four.background = resources.getDrawable(R.drawable.light_blue_box)
        }
        five.setOnClickListener{
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,SunWorkoutFragment())
            transition.commit()
//            five.background = resources.getDrawable(R.drawable.light_blue_box)
        }
        six.setOnClickListener{
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,MonWorkoutFragment())
            transition.commit()
//            six.background = resources.getDrawable(R.drawable.light_blue_box)
        }
        seven.setOnClickListener{
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,TueWorkoutFragment())
            transition.commit()
//            seven.background = resources.getDrawable(R.drawable.light_blue_box)
        }
        eight.setOnClickListener{
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,WedWorkoutFragment())
            transition.commit()
//            eight.background = resources.getDrawable(R.drawable.light_blue_box)
        }
        nine.setOnClickListener{
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,ThruWorkoutFragment())
            transition.commit()
//            nine.background = resources.getDrawable(R.drawable.light_blue_box)
        }
        ten.setOnClickListener{
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,FriWorkoutFragment())
            transition.commit()
//            ten.background = resources.getDrawable(R.drawable.light_blue_box)
        }
        eleven.setOnClickListener{
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,SatWorkoutFragment())
            transition.commit()
//            eleven.background = resources.getDrawable(R.drawable.light_blue_box)
        }
        twelve.setOnClickListener{
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,SunWorkoutFragment())
            transition.commit()
//            twelve.background = resources.getDrawable(R.drawable.light_blue_box)
        }
        thirteen.setOnClickListener{
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,MonWorkoutFragment())
            transition.commit()
//            thirteen.background = resources.getDrawable(R.drawable.light_blue_box)
        }
        fourteen.setOnClickListener{
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,TueWorkoutFragment())
            transition.commit()
//            fourteen.background = resources.getDrawable(R.drawable.light_blue_box)
        }
        fifteen.setOnClickListener{
            var manager = supportFragmentManager
            var transition = manager.beginTransaction()
            transition.replace(R.id.exercise,WedWorkoutFragment())
            transition.commit()
//            fifteen.background = resources.getDrawable(R.drawable.light_blue_box)
        }


    }
}