package com.example.progresbarkotlin

import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.graphics.drawable.ScaleDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<ProgressBar>(R.id.progressBar).incrementProgressBy(1)
            findViewById<ProgressBar>(R.id.progressBar2).incrementProgressBy(2)

            val shape: Drawable? = getDrawable(R.drawable.gradient_box)
            val tv: TextView = findViewById(R.id.textView)
            tv.background = shape
        }
    }
}