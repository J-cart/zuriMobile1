package com.android.listlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signIn()
    }

    private fun signIn() {
        val email = findViewById<TextInputEditText>(R.id.edit_user)
        val passcode = findViewById<TextInputEditText>(R.id.edit_passcode)
        val login = findViewById<MaterialButton>(R.id.Login_button)

        login.setOnClickListener(){
            if(email.text.toString().isNullOrBlank() || passcode.text.toString().isNullOrBlank()){
                Toast.makeText(this, "Input Email or Password", Toast.LENGTH_SHORT).show()
            } else{
                if(email.text.toString() == "man@gmail.com" && passcode.text.toString() == "12345"){
                    val intent = Intent(this, DetailActivity::class.java)
                    startActivity(intent)
                } else{
                    Toast.makeText(this, "Wrong Email or Password", Toast.LENGTH_SHORT).show()
                }
            }

        }
    }
}

//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