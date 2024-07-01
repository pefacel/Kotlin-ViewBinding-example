package com.example.viewbinding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.goToArkham.setOnClickListener {
            val intent = Intent(this, ArkhamHorrorActivity::class.java)
            startActivity(intent)
        }

//        binding.enterButton.setOnClickListener {
//            val intent = Intent(this,MainActivity2::class.java)
//            startActivity(intent)
//        }

    }
}