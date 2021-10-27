package com.example.testing

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
      fun changeActivity(view: View){
        when(view.id){
            R.id.button2 ->{
                val intent=Intent(this,SecondActivity::class.java)
                startActivity(intent)
            }
        }
    }
}