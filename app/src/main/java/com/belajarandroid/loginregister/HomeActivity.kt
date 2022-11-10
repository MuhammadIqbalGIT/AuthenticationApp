package com.belajarandroid.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.belajarandroid.loginregister.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val btnLogin : Button = findViewById(R.id.btnLogin)
        val btnRegister : Button = findViewById(R.id.btnRegister)


        btnLogin.setOnClickListener {
            val i = Intent (this,LoginActivity::class.java)
            startActivity(i)
        }
        btnRegister.setOnClickListener {
            val i = Intent (this,RegisterActivity::class.java)
            startActivity(i)
        }
    }
}