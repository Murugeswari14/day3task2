package com.my.day3task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        var correctAnswer=intent.getIntExtra("numberIs",0)
        findViewById<TextView>(R.id.answerView1).text="$correctAnswer"

    }
}