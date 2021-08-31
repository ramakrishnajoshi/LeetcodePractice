package com.example.leetcodepractice.foregroundservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.leetcodepractice.R

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val startService = findViewById<Button>(R.id.buttonStartService)
        val stopService = findViewById<Button>(R.id.buttonStopService)

        startService.setOnClickListener {
            val intent = Intent(this, MyForegroundService::class.java)
            intent.putExtra("input_string", "1234")
            startService(intent)
        }

        stopService.setOnClickListener {
            val intent = Intent(this, MyForegroundService::class.java)
            stopService(intent)
        }
    }
}