package com.android.listlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signIn()
    }

    private fun signIn() {
        val login = findViewById<MaterialButton>(R.id.Login_button)

        login.setOnClickListener(){
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
    }
}

//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