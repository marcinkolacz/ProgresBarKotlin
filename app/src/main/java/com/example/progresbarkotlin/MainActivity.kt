package com.example.progresbarkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<ProgressBar>(R.id.progressBar).incrementProgressBy(1)
            findViewById<ProgressBar>(R.id.progressBar2).incrementProgressBy(2)
        }
    }
}