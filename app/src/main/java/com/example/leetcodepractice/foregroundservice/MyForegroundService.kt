package com.example.leetcodepractice.foregroundservice

import android.app.PendingIntent
import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.core.app.NotificationCompat
import com.example.leetcodepractice.MainActivity

//A service is like a Activity without the ui. Service by default runs on UI thread.
//A service can be created from Activity or BroadcastReceiver and then it keeps running independently from the component that started it.
//IntentService runs on background thread by default and adds the task to a task list and excutes them on by one.
class MyForegroundService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null // we need to override this method even if we are not making use of binded service
    }

    //oncreate is called when service is created
    override fun onCreate() {
        super.onCreate()
    }

    //onStartCommand is called every time we call startService
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        //return super.onStartCommand(intent, flags, startId)

        val notificationTitle = intent?.getStringExtra("input_string") ?: ""

        //In order to provide notification click action, pass pending intent to notification.
        val notificationClickAction = Intent(this@MyForegroundService, MainActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(
                this@MyForegroundService,
                111, // to update the intent in future
                    notificationClickAction,
                0
        )

        val notification = NotificationCompat
                .Builder(this@MyForegroundService, "channelId001")
                .setContentTitle("Content Title")
                .setContentText("Content Text")
                .setSubText("Sub Text")
                .setContentIntent(pendingIntent)
                .build()

       /* val handler = Handler(Looper.getMainLooper())
        handler.postDelayed( {
            notification
        }, 1500)*/

        //startForeground(1, notification)

        return START_NOT_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}