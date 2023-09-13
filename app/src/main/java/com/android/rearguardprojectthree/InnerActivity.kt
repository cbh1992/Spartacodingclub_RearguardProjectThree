package com.android.rearguardprojectthree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class InnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inner)

        Log.d("onCreate","Create Log Test Text(InnerActivity)")
    }

    override fun onStart() {
        super.onStart()

        Log.d("onStart","Start Log Test Text(InnerActivity)")
    }

    override fun onResume() {
        super.onResume()

        Log.d("onResume","Resume Log Test Text(InnerActivity)")
    }

    override fun onPause() {
        super.onPause()

        Log.d("onPause","Pause Log Test Text(InnerActivity)")
    }

    override fun onStop() {
        super.onStop()

        Log.d("onStop","Stop Log Test Text(InnerActivity)")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("onDestroy","Destroy Log Test Text(InnerActivity)")
    }
}