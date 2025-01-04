package com.example.kontores

import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var emailInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var confirmPasswordInput: EditText
    private lateinit var messageView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailInput = findViewById(R.id.emailInput)
        passwordInput = findViewById(R.id.passwordInput)
        confirmPasswordInput = findViewById(R.id.confirmPasswordInput)
        messageView = findViewById(R.id.messageView)
        val submitButton: Button = findViewById(R.id.submitButton)

        submitButton.setOnClickListener {
            validateInput()
        }
    }

    private fun validateInput() {
        val email = emailInput.text.toString()
        val password = passwordInput.text.toString()
        val confirmPassword = confirmPasswordInput.text.toString()

        when {
            email.isEmpty() || !email.contains("@") -> {
                messageView.text = "Nieprawidłowy adres e-mail"
            }
            password != confirmPassword -> {
                messageView.text = "Hasła się różnią"
            }
            else -> {
                messageView.text = "Witaj $email"
            }
        }
    }
}