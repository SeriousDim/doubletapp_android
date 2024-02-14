package ru.seriousdim.doubletappandroidtask2

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class FirstActivity : AppCompatActivity() {
    private val LOG_TAG = "LOG_TAG"

    private val NUMBER_VALUE_STATE = "NUMBER_VALUE_STATE"

    private lateinit var numberView: TextView
    private lateinit var toSecondActivityButton: Button

    private var numberValue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        this.numberView = findViewById(R.id.numberView)
        this.numberView.text = "0"

        this.toSecondActivityButton = findViewById(R.id.toSecondActivityButton)

        Log.i(LOG_TAG, "FirstActivity: onCreate has been called")
    }

    fun onButtonClick(view: View) {
        startActivity(Intent(
            this,
            SecondActivity::class.java
        ).apply {
            putExtra(NUMBER_VALUE_STATE, numberValue)
        })
    }

    override fun onStart() {
        super.onStart()

        Log.i(LOG_TAG, "FirstActivity: onStart has been called")
    }

    override fun onResume() {
        super.onResume()

        this.numberView.text = numberValue.toString()

        Log.i(LOG_TAG, "FirstActivity: onResume has been called")
    }

    override fun onPause() {
        super.onPause()

        Log.i(LOG_TAG, "FirstActivity: onPause has been called")
    }

    override fun onStop() {
        super.onStop()

        Log.i(LOG_TAG, "FirstActivity: onStop has been called")
    }

    override fun onRestart() {
        super.onRestart()

        Log.i(LOG_TAG, "FirstActivity: onRestart has been called")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i(LOG_TAG, "FirstActivity: onDestroy has been called")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        Log.i(LOG_TAG, "FirstActivity: onConfigurationChanged has been called")
        super.onConfigurationChanged(newConfig)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(NUMBER_VALUE_STATE, this.numberValue)
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        this.numberValue = savedInstanceState.getInt(NUMBER_VALUE_STATE) + 1
    }
}