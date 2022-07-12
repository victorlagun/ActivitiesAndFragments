package com.example.activitiesfragments

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.container, FirstFragment.newInstance())
        fragmentTransaction.commit()

        Log.d("LIVE_CYCLE", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LIVE_CYCLE", "onStart")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("LIVE_CYCLE", "onRestoreInstanceState")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LIVE_CYCLE", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LIVE_CYCLE", "onPause")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("LIVE_CYCLE", "onSaveInstanceState")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LIVE_CYCLE", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LIVE_CYCLE", "onDestroy")
    }
}