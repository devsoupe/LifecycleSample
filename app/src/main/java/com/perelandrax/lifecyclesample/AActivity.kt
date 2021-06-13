package com.perelandrax.lifecyclesample

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AActivity : AppCompatActivity() {

  companion object {
    private var TAG = AActivity::class.java.simpleName
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_a)
    Log.d(TAG, "[AActivity] onCreate()")

    findViewById<Button>(R.id.btn_startactivity_a_to_b).setOnClickListener {
      startActivity(Intent(this, BActivity::class.java))
    }
  }

  override fun onRestart() {
    super.onRestart()
    Log.d(TAG, "[AActivity] onRestart()")
  }

  override fun onStart() {
    super.onStart()
    Log.d(TAG, "[AActivity] onStart()")
  }

  override fun onResume() {
    super.onResume()
    Log.d(TAG, "[AActivity] onResume()")
  }

  override fun onPause() {
    super.onPause()
    Log.d(TAG, "[AActivity] onPause()")
  }

  override fun onStop() {
    super.onStop()
    Log.d(TAG, "[AActivity] onStop()")
  }

  override fun onDestroy() {
    super.onDestroy()
    Log.d(TAG, "[AActivity] onDestroy()")
  }
}
