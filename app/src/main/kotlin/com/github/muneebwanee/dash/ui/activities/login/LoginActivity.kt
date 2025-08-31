package com.github.muneebwanee.dash.ui.activities.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.muneebwanee.dash.R
import com.github.muneebwanee.dash.ui.activities.mainparent.MainParentActivity
import com.github.muneebwanee.dash.ui.activities.register.RegisterActivity

class LoginActivity : AppCompatActivity(), InterfaceViewLogin {
    
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var signUpTextView: TextView
    
    private lateinit var interactor: InteractorLogin<InterfaceViewLogin>
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        
        setupViews()
        setupInteractor()
        setupClickListeners()
    }
    
    private fun setupViews() {
        emailEditText = findViewById(R.id.edit_login_email)
        passwordEditText = findViewById(R.id.edit_login_password)
        loginButton = findViewById(R.id.btn_login_signin)
                    signUpTextView = findViewById(R.id.txt_login_signup)
    }
    
    private fun setupInteractor() {
        interactor = InteractorLogin()
        interactor.onAttach(this)
    }
    
    private fun setupClickListeners() {
        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            interactor.signInDisposable(email, password)
        }
        
        signUpTextView.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
    
    override fun onSuccessLogin() {
        Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, MainParentActivity::class.java)
        startActivity(intent)
        finish()
    }
    
    override fun onErrorLogin(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
    
    override fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
    
    override fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
    
    override fun showMessage(message: Int) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
    
    override fun onDestroy() {
        interactor.onDetach()
        super.onDestroy()
    }
}