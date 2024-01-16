package com.projet.myapplication.ui.splash

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.projet.myapplication.R
import androidx.appcompat.app.AppCompatActivity
import com.projet.myapplication.ui.main.MainActivity

class SplashActivity : AppCompatActivity() {

    companion object{
        fun getStartIntent(context: Context): Intent {
            return Intent(context, SplashActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(MainActivity.getStartIntent(this))
            finish()
        }, 2000)
    }

}