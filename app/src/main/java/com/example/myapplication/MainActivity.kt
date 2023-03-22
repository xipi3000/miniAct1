package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button = findViewById(R.id.button)
        button.setOnClickListener(Toaster());

    }
    inner class Toaster : View.OnClickListener {
        override fun onClick(v : View){
            Toast.makeText(baseContext, getString(R.string.emerg_msg), Toast.LENGTH_SHORT).show();
        }
    }
    }