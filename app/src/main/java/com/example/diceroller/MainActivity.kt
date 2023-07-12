package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button=findViewById<Button>(R.id.rollButton)
        val imageView=findViewById<ImageView>(R.id.diceView)
        button.setOnClickListener{
            val n=(1..6).random()
            imageView.setImageResource(when(n){
                1->R.drawable.dice_1
                2->R.drawable.dice_2
                3->R.drawable.dice_3
                4->R.drawable.dice_4
                5->R.drawable.dice_5
                6->R.drawable.dice_6
                else->throw Exception("n must be between 1 to 6")
            })
        }
        val diceNumberView=findViewById<TextInputLayout>(R.id.diceNumber)
        diceNumberView.setOnClickListener{
            val enteredText=diceNumberView.text.toString()
        }
    }
}