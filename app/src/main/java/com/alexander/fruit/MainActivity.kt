package com.alexander.fruit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.alexander.fruit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val anim1 = AnimationUtils.loadAnimation(this, R.anim.splash)
        val anim2 = AnimationUtils.loadAnimation(this, R.anim.splashtwo)
        val anim3 = AnimationUtils.loadAnimation(this, R.anim.splashthird)
        binding.appleIcon.startAnimation(anim1)
        binding.bananaIcon.startAnimation(anim2)
        binding.pearIcon.startAnimation(anim3)
        anim3.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                startActivity(Intent(this@MainActivity, FruitsActivity::class.java))
                finish()
            }

            override fun onAnimationRepeat(animation: Animation?) {
                Toast.makeText(this@MainActivity, "repeat", Toast.LENGTH_SHORT).show()
            }

        })

    }
}