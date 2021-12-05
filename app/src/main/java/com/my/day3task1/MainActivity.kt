package com.my.day3task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import java.lang.Exception
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var number= Random.nextInt(0,1000)
    var count=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickButton= findViewById<TextView>(R.id.clickButton)
        val typeValue=findViewById<TextInputLayout>(R.id.typeText)
        val guess=findViewById<TextView>(R.id.guessView)

        clickButton.setOnClickListener{
            try {
                val numberGuess = typeValue.editText?.text.toString()
                val valueGuess=Integer.parseInt(numberGuess)

                val value=
                    if(valueGuess<0)
                    {
                        count++
                        "please enter a positive number"

                    }
                    else if(valueGuess<number)
                    {
                    count++
                        "N0 :)) My Number is bigger"
                    }
                    else if(valueGuess>number)
                    {
                        count++
                        "NO :)) My number is smaller"
                    }
                    else
                    {
                        val winScreenIntent=Intent(this,WonActivity::class.java)
                        winScreenIntent.putExtra("numberIs",number)
                        startActivity(winScreenIntent)
                        "you won!!"

                    }
                guess.text="$value"
                if(count==12)
                {
                    val finalActivityIntent=Intent(this,FinalActivity::class.java)
                    finalActivityIntent.putExtra("numberIs",number)
                    startActivity(finalActivityIntent)
                }
            }
            catch (e:Exception)
            {
               guess.text="Please enter a number"
            }



        }
    }
}