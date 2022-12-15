package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

//import com.example.FirstApp.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    //private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val setTool: Button = findViewById(R.id.button)
        setTool.setOnClickListener {
            buttonChange()
            Toast.makeText(this, "The story of my life ...", Toast.LENGTH_LONG).show()
            Toast.makeText(this, "keep pressing !!", Toast.LENGTH_SHORT).show()
            buttonChange()

        }
    }

    private fun buttonChange() {
        val d2 = DiceDino(2)
        val diceRoll = d2.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)

        val diceImageDino = when(diceRoll) {
            1 -> R.drawable.dino
            else -> R.drawable.dino_coso
        }

    diceImage.setImageResource(diceImageDino)

    diceImage.contentDescription = diceRoll.toString()
    }

    class DiceDino(private val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()

        }
    }
}



