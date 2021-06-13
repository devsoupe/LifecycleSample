package com.perelandrax.lifecyclesample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class BActivity : AppCompatActivity() {

    companion object {
        private var TAG = BActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_b)
        Log.d(TAG, "[BActivity] onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "[BActivity] onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "[BActivity] onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "[BActivity] onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "[BActivity] onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "[BActivity] onDestroy()")
    }
}