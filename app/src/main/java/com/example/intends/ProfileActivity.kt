package com.example.intends

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intends.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.voltarButton.setOnClickListener{
//            startActivity(Intent(this,MainActivity::class.java))
            finish()
            //se ela é a ultima activity você deve usar o comando finish ao invés de usar startactivity para encerra o histórico
        }
    }
}