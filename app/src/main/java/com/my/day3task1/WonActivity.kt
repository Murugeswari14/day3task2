package com.my.day3task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_won)
        var correctAnswer=intent.getIntExtra("numberIs",0)
        findViewById<TextView>(R.id.answerView).text="$correctAnswer"

    }
}