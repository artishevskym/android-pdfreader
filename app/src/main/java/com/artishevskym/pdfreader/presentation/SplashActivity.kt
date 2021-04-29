package com.artishevskym.pdfreader.presentation

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.artishevskym.pdfreader.R


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setFullScreen()

        setContentView(R.layout.splash_activity)
    }

    private fun setFullScreen() {
        // remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE)

        // hide toolbar
        supportActionBar?.hide()

        // set fullscreen flags
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }
}