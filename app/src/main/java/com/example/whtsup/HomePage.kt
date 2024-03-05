package com.example.whtsup

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class HomePage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val myList = findViewById<ListView>(R.id.listOfName)
        val loginbtn = findViewById<Button>(R.id.login)

        // Retrieve data from intent
        val dataFromMain = intent.getStringExtra("key")

        myList.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            arrayOf("Maa", "papa", "Ritik", "Saini", "Rk", "Bhai", "Sis", "Dost", "Sir", "mam", dataFromMain)
        )
    }
}
