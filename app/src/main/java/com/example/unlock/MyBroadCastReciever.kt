package com.example.unlock

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast


class MyBroadCastReciever : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_SCREEN_OFF) {
            Log.e("Check", "Screen went OFF")
            Toast.makeText(context, "screen OFF", Toast.LENGTH_LONG).show()
        } else if (intent.action == Intent.ACTION_SCREEN_ON) {
            Log.e("Check", "Screen went ON")
            Toast.makeText(context, "screen ON", Toast.LENGTH_LONG).show()
        }
    }
}