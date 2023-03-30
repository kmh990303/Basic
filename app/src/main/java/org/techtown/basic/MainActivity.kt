package org.techtown.basic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.techtown.basic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding:ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.textview.text="안녕하세요. 아롬입니다"

    }
}