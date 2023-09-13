package com.android.rearguardprojectthree

import android.app.appsearch.StorageInfo
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next = findViewById<Button>(R.id.button)
        next.setOnClickListener {
            val change = Intent(this,InnerActivity::class.java)
            startActivity(change)
        }

        val frag = supportFragmentManager.beginTransaction()

        val fragclick = findViewById<Button>(R.id.button2)
        fragclick.setOnClickListener {
        setContentView(R.layout.fragment_blank2)
                //frag.addToBackStack(null)
                //frag.commit()
            }


        Log.d("onCreate","Create Log Test Text(MainActivity)")
    }

    override fun onStart() {
        super.onStart()

        Log.d("onStart","Start Log Test Text(MainActivity)")
    }

    override fun onResume() {
        super.onResume()

        Log.d("onResume","Resume Log Test Text(MainActivity)")
    }

    override fun onPause() {
        super.onPause()

        Log.d("onPause","Pause Log Test Text(MainActivity)")
    }

    override fun onStop() {
        super.onStop()

        Log.d("onStop","Stop Log Test Text(MainActivity)")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("onDestroy","Destroy Log Test Text(MainActivity)")
    }
}