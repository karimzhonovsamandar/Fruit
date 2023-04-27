package com.alexander.fruit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alexander.fruit.databinding.ActivityFruitsBinding
import com.alexander.fruit.types.AppleActivity
import com.alexander.fruit.types.BananaActivity
import com.alexander.fruit.types.PearActivity

class FruitsActivity : AppCompatActivity() {
    lateinit var binding: ActivityFruitsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityFruitsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.appleLinear.setOnClickListener {
            startActivity(Intent(this, AppleActivity::class.java))
        }

        binding.bananaLinear.setOnClickListener {
            startActivity(Intent(this, BananaActivity::class.java))
        }

        binding.pearLinear.setOnClickListener {
            startActivity(Intent(this, PearActivity::class.java))
        }



    }
}