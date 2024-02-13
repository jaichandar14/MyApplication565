package com.wheels.myapplication565.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wheels.myapplication565.R
import com.wheels.myapplication565.base.BaseActivity
import com.wheels.myapplication565.base.MyApplication
import com.wheels.myapplication565.databinding.ActivityMainBinding
import com.wheels.myapplication565.ui.adapter.AppListAdapter
import javax.inject.Inject

class MainActivity : BaseActivity<MainViewModel>() {
    lateinit var binding: ActivityMainBinding
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: AppListAdapter
    @Inject
    lateinit var mainViewModelFactory: MainViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MyApplication.appComponent?.inject(this)
        mIntitalizer()
        binding.name.text="jai ellow how are you da "
        var dataset=ArrayList<String>()
        dataset.add("jai")
        dataset.add("jai1")
        dataset.add("jai2")
        dataset.add("jai3")

        adapter.refreshItems(dataset)
    }

    private fun mIntitalizer() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this,mainViewModelFactory)[MainViewModel::class.java]
        binding.mainViewModel = viewModel
        binding.lifecycleOwner = this
        mIntitalizeRecylerView()
    }

    private  fun mIntitalizeRecylerView(){
        recyclerView = binding.applist
        adapter = AppListAdapter(this)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter
    }
}