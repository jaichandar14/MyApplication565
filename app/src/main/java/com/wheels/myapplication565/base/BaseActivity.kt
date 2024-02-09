package com.wheels.myapplication565.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer

abstract class BaseActivity<T : BaseViewModel> : AppCompatActivity() {

    lateinit var viewModel: T


    private fun observer() {


    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        observer()
    }
}