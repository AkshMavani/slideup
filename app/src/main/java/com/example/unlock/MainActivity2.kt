package com.example.unlock


import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    val mScreenStateReceiver:BroadcastReceiver?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        registerReceiver(mScreenStateReceiver,  IntentFilter(Intent.ACTION_SCREEN_ON));
        registerReceiver(mScreenStateReceiver,  IntentFilter(Intent.ACTION_SCREEN_OFF));
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(mScreenStateReceiver);
    }
}