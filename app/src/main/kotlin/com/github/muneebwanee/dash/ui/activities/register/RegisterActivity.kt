package com.github.muneebwanee.dash.ui.activities.register

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.muneebwanee.dash.R
import com.github.muneebwanee.dash.ui.activities.login.LoginActivity

class RegisterActivity : AppCompatActivity() {
    
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var confirmPasswordEditText: EditText
    private lateinit var registerButton: Button
    private lateinit var backToLoginButton: Button
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        
        setupViews()
        setupClickListeners()
    }
    
    private fun setupViews() {
        emailEditText = findViewById(R.id.edit_register_email)
        passwordEditText = findViewById(R.id.edit_register_password)
        confirmPasswordEditText = findViewById(R.id.edit_register_confirm_password)
        registerButton = findViewById(R.id.btn_register_signup)
        backToLoginButton = findViewById(R.id.btn_back_to_login)
    }
    
    private fun setupClickListeners() {
        registerButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            val confirmPassword = confirmPasswordEditText.text.toString()
            
            if (email.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty()) {
                if (password == confirmPassword) {
                    Toast.makeText(this, "Registration successful!", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
        }
        
        backToLoginButton.setOnClickListener {
            finish()
        }
    }
}