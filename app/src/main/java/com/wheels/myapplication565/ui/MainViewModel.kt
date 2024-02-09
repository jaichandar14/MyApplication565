package com.wheels.myapplication565.ui

import androidx.lifecycle.viewModelScope
import com.wheels.myapplication565.base.BaseViewModel
import com.wheels.myapplication565.base.data.RepositoryImpl
import kotlinx.coroutines.launch

class MainViewModel(var repositoryImpl: RepositoryImpl):BaseViewModel() {
    init {
        // this is the coroutine that we use to connenct the api.
        viewModelScope.launch {
            repositoryImpl.getcountries()
        }
    }
}