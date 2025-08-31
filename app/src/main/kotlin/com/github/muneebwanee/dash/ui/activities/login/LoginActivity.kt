package com.github.muneebwanee.dash.ui.activities.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.muneebwanee.dash.R
import com.github.muneebwanee.dash.ui.activities.mainparent.MainParentActivity

class LoginActivity : AppCompatActivity() {
    
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        
        setupViews()
        setupClickListeners()
    }
    
    private fun setupViews() {
        emailEditText = findViewById(R.id.emailEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        loginButton = findViewById(R.id.loginButton)
    }
    
    private fun setupClickListeners() {
        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            
            if (email.isNotEmpty() && password.isNotEmpty()) {
                // Simple login - just proceed to main activity
                val intent = Intent(this, MainParentActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}