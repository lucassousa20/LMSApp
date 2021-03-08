package br.com.lucassousa.lmsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class DebugActivity : AppCompatActivity() {

    private val TAG = "LMSApp"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, msg:"ssa")
    }
}