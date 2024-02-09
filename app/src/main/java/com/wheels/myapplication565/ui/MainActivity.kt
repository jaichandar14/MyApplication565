package com.wheels.myapplication565.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.wheels.myapplication565.R
import com.wheels.myapplication565.base.BaseActivity
import com.wheels.myapplication565.base.MyApplication
import com.wheels.myapplication565.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : BaseActivity<MainViewModel>() {
    lateinit var binding: ActivityMainBinding
    @Inject
    lateinit var mainViewModelFactory: MainViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MyApplication.appComponent?.inject(this)
        mIntitalizer()
        binding.name.text="jai ellow how are you da "
    }

    private fun mIntitalizer() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this,mainViewModelFactory)[MainViewModel::class.java]
        binding.mainViewModel = viewModel
        binding.lifecycleOwner = this
    }
}