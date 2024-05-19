package com.example.unlock


import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.PixelFormat
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.xw.repo.supl.SlidingUpPanelLayout


class MainActivity : AppCompatActivity() {
var count=0
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val penel=findViewById<SlidingUpPanelLayout>(R.id.sliding_up_panel_layout)

//        val btn = findViewById<Button>(R.id.btnLock)
//        val btnenable = findViewById<Button>(R.id.btnEnable)
//        val btnenable1 = findViewById<Button>(R.id.btnLock1)
//        val btnvalue = findViewById<Button>(R.id.btn_value)

        val sp = getSharedPreferences("SP", MODE_PRIVATE)
        val edit_chk = sp.edit()

//        val linear=findViewById<LinearLayout>(R.id.linear)
//        btn.setOnClickListener {
//            if (count>=4 || count==3){
//                Toast.makeText(this,"not",Toast.LENGTH_SHORT).show()
//            }else {
//                count += 2
//                Log.e("TAG", "onCreate:$count ")
//                val wizardView: View = layoutInflater
//                    .inflate(R.layout.abc, linear, false)
//                linear.addView(wizardView)
//                val view=wizardView.findViewById<TextView>(R.id.textView)
//                view.setOnClickListener {
//                    linear.removeView(wizardView)
//                }
//                edit_chk.putBoolean("data",true).apply()
//            }
//        }
//        btnenable.setOnClickListener {
//            if (count>=4){
//                Toast.makeText(this,"not",Toast.LENGTH_SHORT).show()
//            }else {
//                count += 1
//                Log.e("TAG", "onCreate:$count ")
//                val wizardView: View = layoutInflater
//                    .inflate(R.layout.def, linear, false)
//                linear.addView(wizardView)
//
//                edit_chk.putBoolean("data1",true).apply()
//            }
//        }
//        btnenable1.setOnClickListener {
//            if (count>=4){
//                Toast.makeText(this,"not",Toast.LENGTH_SHORT).show()
//            }else{
//                count+=1
//                Log.e("TAG", "onCreate:$count ")
//                val wizardView: View = layoutInflater
//                    .inflate(R.layout.ghi, linear, false)
//                linear.addView(wizardView)
//                edit_chk.putBoolean("data2",true).apply()
//            }
//        }
//        btnvalue.setOnClickListener {
////            val a=sp.getBoolean("data",false)
////            val b=sp.getBoolean("data1",false)
////            val c=sp.getBoolean("data2",false)
////            Log.e("TAG", "data:$a ")
////            Log.e("TAG", "data1:$b ")
////            Log.e("TAG", "data2:$c ")
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && !Settings.canDrawOverlays(this)) {
//                val intent = Intent(
//                    Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
//                    Uri.parse("package:$packageName")
//                )
//                startActivityForResult(intent, 100)
//                addOverlayView(this)
//            }
//
//        }
//    }
//    fun addOverlayView(context: Context) {
//        val wm = context.getSystemService(WINDOW_SERVICE) as WindowManager
//        val params = WindowManager.LayoutParams(
//            WindowManager.LayoutParams.MATCH_PARENT,
//            WindowManager.LayoutParams.MATCH_PARENT,
//            WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
//            WindowManager.LayoutParams.FLAG_FULLSCREEN
//                    or WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
//                    or WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED
//                    or WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
//                    or WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD,
//            PixelFormat.TRANSLUCENT
//        )
//        val overlayView: View = LayoutInflater.from(context).inflate(R.layout.overlay_layout, null)
//        wm.addView(overlayView, params)
//    }
    }

}