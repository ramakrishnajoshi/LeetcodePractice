package com.example.leetcodepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

private const val TAG = "HomeActivity"
class HomeActivity : AppCompatActivity() {

    val startTaskButton: Button by lazy {
        findViewById(R.id.button_start_task)
    }
    val stopTaskButton : Button by lazy { findViewById(R.id.button_stop_task) }

    val backgroundThread = ExampleLooperThread()

    override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_home)

      backgroundThread.start()
      startTaskButton.setOnClickListener {
          backgroundThread.handler.post{
              //some background task here
              for (i in 1..8){
                  Log.e(TAG, i.toString())
                  Thread.sleep(1000)
              }
          }
        }

      stopTaskButton.setOnClickListener {
        backgroundThread.looper.quit()
        //Quits Looper without processing any more messages in the message queue.

        backgroundThread.looper.quitSafely()
        //Quits looper after handling current messageQueue
      }
    }
}