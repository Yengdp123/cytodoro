package com.example.cytodoro

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @Override
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById(R.id.btnStartGame).setOnClickListener(object : OnClickListener() {
            @Override
            fun onClick(view: View?) {
                startWelcomeActivity()
            }
        })
    }

    private fun startWelcomeActivity() {
        val intent: Intent = Intent(this@MainActivity, WelcomeActivity::class.java)
        startActivity(intent)
    }
}