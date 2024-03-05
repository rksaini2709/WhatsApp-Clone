package com.example.whtsup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var loginBtn = findViewById<Button>(R.id.login)

        val imageView: ImageView = findViewById(R.id.imageView)
        imageView.setImageResource(R.drawable.whatsapp_icon)

        loginBtn.setOnClickListener {
            var intent = Intent(this, HomePage::class.java)
            intent.putExtra("key", "Hello from MainActivity")
            startActivity(intent)
        }
    }
}