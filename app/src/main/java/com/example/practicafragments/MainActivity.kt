package com.example.practicafragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.models.User
import com.example.models.UserViewModel
import com.example.myfragments.myOwnFragment
import com.example.practicafragments.databinding.ActivityMainBinding
import java.util.Optional.of


class MainActivity : AppCompatActivity() {

    //var viewModel: ViewModel = ViewModelProvider.of(this).get(UserViewModel.class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        // ActivityMainBinding is the name of activity_main.xml
        //the compiler gif us that name to user DataBinding.
        var binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )
        //Now we'll initialice the binding
        binding.user = User("Edgar", "Elizarraras", "DF")


        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        //Add a fragment to this view
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
