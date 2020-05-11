package com.example.practicafragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.*
import com.example.models.UserModel
import com.example.myfragments.myOwnFragment
import com.example.practicafragments.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var localInstanceOfViewModel: UserModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        // ActivityMainBinding is the name of activity_main.xml
        //the compiler gif us that name to user DataBinding.
        var binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )

        //Here We change the a value on UserModel
        localInstanceOfViewModel = ViewModelProviders.of(this).get(UserModel::class.java)

        //Now we'll initialice the binding
        //binding.userModel = UserModel()
        binding.userModel = localInstanceOfViewModel

        localInstanceOfViewModel.updateName("Edgar manual <3")
        //binding.userModel!!.name.value = localInstanceOfViewModel.name.value.toString()


        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        //Add a fragment to this view
        val myOwnFragment = myOwnFragment()
        fragmentTransaction.add(R.id.fragment_container, myOwnFragment)
        fragmentTransaction.commit()


        /**
        myViewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)

        val userNameWithLiveData = Observer<String> { userName ->
            binding.user!!.Name = userName.toString()
        }

        //Here, this method says "This variable will be ear"
        myViewModel.userName.observe(this, userNameWithLiveData)
         */
    }

    fun sendMessage(view: View){
        val editText = findViewById<EditText>(R.id.editText_fragment)
        val message = editText.text.toString()

        val intent = Intent(this, Main2Activity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}
