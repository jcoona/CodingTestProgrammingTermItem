package com.example.myapplication

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

class MainViewModel : ViewModel(), MainInteractions {

    val stateFlow = MutableStateFlow(MainState())
    private val repository = MainScreenRepository()

    override fun onClick() {

    }

    override fun onDialogAccepted() {

    }

    override fun onDialogCanceled() {

    }
}
