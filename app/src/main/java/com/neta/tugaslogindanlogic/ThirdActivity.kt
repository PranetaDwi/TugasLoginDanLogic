package com.neta.tugaslogindanlogic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neta.tugaslogindanlogic.databinding.ActivityMainBinding
import com.neta.tugaslogindanlogic.databinding.ActivitySecondBinding
import com.neta.tugaslogindanlogic.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            textViewRegister.setOnClickListener{
                val intentToMainActivity = Intent(this@ThirdActivity, MainActivity::class.java)
                startActivity(intentToMainActivity)
            }
        }
    }

}