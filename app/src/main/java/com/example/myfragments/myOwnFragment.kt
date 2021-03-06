package com.example.myfragments

import android.app.LauncherActivity
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.example.models.User
import com.example.practicafragments.R

class myOwnFragment: Fragment(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //val myFragmentDatabinding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, R.layout.my_own_fragment, container, false)
        //myFragmentDatabinding.
        return inflater.inflate(R.layout.my_own_fragment, container, false)
    }

    override fun onStop() {
        super.onStop()
    }
}