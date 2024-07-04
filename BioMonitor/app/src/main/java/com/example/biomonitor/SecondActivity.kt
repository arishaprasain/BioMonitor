package com.example.biomonitor

import LoginActivity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.biomonitor.databinding.ActivitySecondBinding

class SecondActivity : ComponentActivity() {

    //view binding for ui
    private lateinit var binding: ActivitySecondBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize View Binding
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)



        //second page , get signup button
        binding.buttonSignUp.setOnClickListener {
            val intent = Intent(this@SecondActivity, ThirdActivity::class.java);
            startActivity(intent);
        }
        binding.buttonGuest.setOnClickListener {
            val intent = Intent(this@SecondActivity, LoginActivity::class.java);
            startActivity(intent);


        }
//        binding.buttonGuest.setOnClickListener {
//            val intent = Intent(this@SecondActivity, FourthActivity::class.java);
//            startActivity(intent);
//
//
//        }

    }
}