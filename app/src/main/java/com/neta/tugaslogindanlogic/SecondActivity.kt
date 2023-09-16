package com.neta.tugaslogindanlogic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neta.tugaslogindanlogic.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(MainActivity.EXTRA_NAME)
        val emails = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val phones = intent.getStringExtra(MainActivity.EXTRA_PHONE)
        with(binding){
            username.text = name
            email.text = emails
            phone.text = phones
        }
    }
}