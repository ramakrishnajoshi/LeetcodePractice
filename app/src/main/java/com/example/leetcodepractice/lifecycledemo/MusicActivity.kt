package com.example.leetcodepractice.lifecycledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.*
import com.example.leetcodepractice.R

class MusicActivity : AppCompatActivity() {

    private val TAG = "MusicActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_music)
        val someLiveData = MutableLiveData<Int>()
    }
}