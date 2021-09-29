package com.fs.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get reference to button
        val btnClickMe = findViewById<Button>(R.id.button)
        val myTextView= findViewById<TextView>(R.id.textView)
        var timesClicked=0
// set on-click listener
        btnClickMe.setOnClickListener {
            timesClicked++
            myTextView.text=timesClicked.toString()
            makeText(this@MainActivity, "You clicked me.", LENGTH_SHORT).show()
        }
    }
}