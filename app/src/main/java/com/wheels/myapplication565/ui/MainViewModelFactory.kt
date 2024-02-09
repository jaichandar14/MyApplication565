package com.wheels.myapplication565.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.wheels.myapplication565.base.data.RepositoryImpl
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(private val repository: RepositoryImpl):
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}