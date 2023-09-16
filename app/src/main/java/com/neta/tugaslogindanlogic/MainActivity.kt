package com.neta.tugaslogindanlogic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neta.tugaslogindanlogic.databinding.ActivityMainBinding
import kotlin.math.E

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            register2.setOnClickListener{
                val intentToSecondActivity = Intent(this@MainActivity, SecondActivity::class.java)
                intentToSecondActivity.putExtra(EXTRA_NAME, usernameInput.text.toString())
                intentToSecondActivity.putExtra(EXTRA_EMAIL, emailInput.text.toString())
                intentToSecondActivity.putExtra(EXTRA_PHONE, phoneInput.text.toString())
                startActivity(intentToSecondActivity)
            }
            buttonLogIn.setOnClickListener{
                val intentToThirdActivity = Intent(this@MainActivity, ThirdActivity::class.java)
                startActivity(intentToThirdActivity)
            }
            register2.isEnabled = false;
            checkbox.setOnCheckedChangeListener{_, isChecked -> register2.isEnabled = isChecked}

        }
    }
}