package com.belajarandroid.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val btnRegisterAccount : Button = findViewById(R.id.btnRegisterAccount)

        val fragmentid = BerandaFragment()
        val fragment = supportFragmentManager.findFragmentByTag(BerandaFragment::class.java.simpleName)



        if (fragment !is BerandaFragment) {
            supportFragmentManager.beginTransaction()
                .add(com.google.android.material.R.id.container, fragmentid, BerandaFragment::class.java.simpleName)
                .commit()

            btnRegisterAccount.setOnClickListener {
                val i = Intent (this,BerandaFragment::class.java)
                startActivity(i)
            }

        }


    }
}