package com.github.muneebwanee.dash

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_simple)
        
        val welcomeText = findViewById<TextView>(R.id.welcomeText)
        welcomeText.text = "KidSafe Monitoring App\n\nApp is working successfully!"
    }
}