package com.example.leetcodepractice

import android.os.Handler
import android.os.HandlerThread
import android.os.Looper

class ExampleHandlerThread : HandlerThread("someName") {

    public lateinit var handler: Handler

    //Call back method that can be explicitly overridden if needed to execute some
    //setup before Looper loops.
    override fun onLooperPrepared() {
        super.onLooperPrepared()

        handler = Handler(Looper.myLooper()!!)
    }
}