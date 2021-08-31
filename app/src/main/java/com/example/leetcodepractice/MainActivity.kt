package com.example.leetcodepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    val handler = Handler(Looper.getMainLooper())
    val someButton by lazy {
        findViewById<Button>(R.id.some_button)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onResume(){
        super.onResume()

        Thread(object: Runnable {
            override fun run() {
                //do background work here
                for (i in 1..200) {
                    Thread.sleep(500)
                    handler.post {
                        someButton.text = i.toString()
                    }
                    Log.e(TAG, i.toString())
                }
            }
        }).start()
/*
        Thread(Runnable {
            //do background work here
            for (i in 11..20) {
                Thread.sleep(500)
                Log.e(TAG, i.toString())
                someButton.text = i.toString()
            }
        }).start()

        Thread {
            //do background work here
            for (i in 11..20) {
                Thread.sleep(500)
                Log.e(TAG, i.toString())
                someButton.text = i.toString()
            }
        }.start()*/
    }

    inner class MyThread : Thread() {
        override fun run() {
            for (i in 1..10) {
                Thread.sleep(1000)
                print(i)
                if (i == 5) {
                    handler.post(object: Runnable {
                        override fun run() {
                            //update ui from here
                        }
                    })
                    handler.post{
                        //update ui from here
                    }

                    runOnUiThread(Runnable {
                        //update ui from here
                    })

                    runOnUiThread {
                        //update ui from here
                    }
                }
            }
        }
    }
}