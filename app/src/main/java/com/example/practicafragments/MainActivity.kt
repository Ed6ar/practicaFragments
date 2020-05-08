package com.example.practicafragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.myfragments.myOwnFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val myOwnFragment = myOwnFragment()
        fragmentTransaction.add(R.id.fragment_container, myOwnFragment)
        fragmentTransaction.commit()
    }

    fun sendMessage(view: View){
        val editText = findViewById<EditText>(R.id.editText_fragment)
        val message = editText.text.toString()

        val intent = Intent(this, Main2Activity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
    fun setName(view: View){}
}
