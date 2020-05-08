package com.example.practicafragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var message = intent.getStringExtra(EXTRA_MESSAGE)

        var editText = findViewById<TextView>(R.id.textView_resultado)
        editText.text = message
    }


    fun sendMessageFromMA2(view: View){

    }
}
