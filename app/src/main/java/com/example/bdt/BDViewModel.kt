package com.example.bdt

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class BDViewModel (application: Application): AndroidViewModel(application) {
    private val bdRepository: BDRepository

    val allBDs: LiveData<List<BD>>

    init{
        val bdDao = BDDatabase.getInstance(application).bdDao()
        bdRepository = BDRepository(bdDao)
        allBDs = bdRepository.alldb
    }

    fun insertBD(bd:BD)=viewModelScope.launch {
        bdRepository.insertBD(bd)
    }
}