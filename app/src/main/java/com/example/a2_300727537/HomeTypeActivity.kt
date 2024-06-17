package com.example.a2_300727537

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a2_300727537.databinding.ActivityHomeTypeBinding

class HomeTypeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeTypeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeTypeBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}