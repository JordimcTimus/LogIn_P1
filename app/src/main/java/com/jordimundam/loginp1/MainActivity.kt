package com.jordimundam.loginp1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val sign_button: Button = findViewById(R.id.signup_button)
        val email: EditText = findViewById(R.id.email_input)
        val pass: EditText = findViewById(R.id.password_input)
        val v_email = "jordi@gmail.com"
        val v_pass = "Admin123"

        sign_button.setOnClickListener {
            if (email.text.toString() == v_email && pass.text.toString() == v_pass) {
                Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Ko", Toast.LENGTH_SHORT).show()
            }
        }
    }
}