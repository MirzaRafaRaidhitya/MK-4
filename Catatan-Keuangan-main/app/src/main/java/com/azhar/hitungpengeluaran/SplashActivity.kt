package com.azhar.hitungpengeluaran

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.azhar.hitungpengeluaran.view.MainActivity



class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)
        Handler(Looper.getMainLooper()).postDelayed({
            goToMainActivity()
        }, 1000L)
    }

    private fun goToMainActivity() {
        Intent(this, MainActivity::class.java).also{
            startActivity(it)
            finish()
        }
    }
}