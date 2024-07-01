package com.example.viewbinding

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.viewbinding.databinding.ActivityArkhamHorrorBinding
import com.example.viewbinding.databinding.ActivityMainBinding
import com.example.viewbinding.fragments.GuardianFragment

class ArkhamHorrorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityArkhamHorrorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityArkhamHorrorBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.homeButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.guardianButton.setOnClickListener {
            replaceFragment(GuardianFragment())
        }


    }

    fun replaceFragment(fragment: Fragment) {

        val fragmentTransaction = supportFragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.fragment, fragment)
        fragmentTransaction.commit()
    }
}