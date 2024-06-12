// ProfileActivity.kt
package com.example.project1874.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.project1874.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Your profile activity initialization code here

        // Example: Setting up back button press to go back to MainActivity
        binding.backToHomeBtn.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        // Override the back button functionality here
        // Optionally, you can add additional logic or just call super.onBackPressed()
    }
}
