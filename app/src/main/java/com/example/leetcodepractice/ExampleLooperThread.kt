package com.example.leetcodepractice

import android.os.Handler
import android.os.Looper
import android.os.Message
import android.util.Log

//This class creates background thread and to
//kill the thread, Looper.quit() needs to be called.
class ExampleLooperThread : Thread() {

    public lateinit var handler: Handler
    public lateinit var anotherHandler: Handler
    public lateinit var looper: Looper

    override fun run() {
        Looper.prepare()
        //A thread gets a Looper & MessageQueue by calling prepare()

        looper = Looper.myLooper()!!
        // myLooper() returns Looper of current thread.

        handler = Handler(looper)

        // Handlers should be created after prepare() and before loop()

        anotherHandler = object: Handler(looper) {
            override fun handleMessage(msg: Message) {
                super.handleMessage(msg)
                // process incoming messages here
                // this will run in non-ui/background thread
            }
        }

        Looper.loop() // creates infinite loop

        Log.e("TAG", "Thread Terminated")
        // Above line Executes when loop is terminated
    }
}
