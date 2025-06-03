package com.csaim.duckk.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.csaim.duckk.data.model.DuckResponse
import com.csaim.duckk.data.repository.DuckRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DuckViewModel:ViewModel() {

    private val repository = DuckRepository()

    private val _duck = MutableStateFlow<DuckResponse?>(null)
    val duck : StateFlow<DuckResponse?> = _duck

    private val _isLoading = MutableStateFlow(false)
    val isLoading : StateFlow<Boolean> = _isLoading

    fun fetchDuck(){
        viewModelScope.launch {
            _isLoading.value = true
            try {
                val response = repository.getRandomDuck()
                _duck.value = response
            }catch (e:Exception){
                e.printStackTrace()
            }
            _isLoading.value = false
        }
    }

}