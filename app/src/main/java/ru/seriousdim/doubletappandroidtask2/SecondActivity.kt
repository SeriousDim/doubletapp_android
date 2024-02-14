package ru.seriousdim.doubletappandroidtask2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private val LOG_TAG = "LOG_TAG"

    private val NUMBER_VALUE_STATE = "NUMBER_VALUE_STATE"

    private var numberValue = 0

    private lateinit var squareNumberView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        this.numberValue = intent.getIntExtra(NUMBER_VALUE_STATE, 0)
        this.numberValue *= this.numberValue

        this.squareNumberView = findViewById(R.id.squareNumberView)

        Log.i(LOG_TAG, "SecondActivity: onCreate has been called")
    }

    override fun onStart() {
        super.onStart()

        Log.i(LOG_TAG, "SecondActivity: onStart has been called")
    }

    override fun onResume() {
        super.onResume()

        this.squareNumberView.text = this.numberValue.toString()

        Log.i(LOG_TAG, "SecondActivity: onResume has been called")
    }

    override fun onPause() {
        super.onPause()

        Log.i(LOG_TAG, "SecondActivity: onPause has been called")
    }

    override fun onStop() {
        super.onStop()

        Log.i(LOG_TAG, "SecondActivity: onStop has been called")
    }

    override fun onRestart() {
        super.onRestart()

        Log.i(LOG_TAG, "SecondActivity: onRestart has been called")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i(LOG_TAG, "SecondActivity: onDestroy has been called")
    }
}