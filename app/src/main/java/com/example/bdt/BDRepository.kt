package com.example.bdt

import android.app.Application
import androidx.lifecycle.LiveData

class BDRepository (private val BDDao: BDDao) {

    val alldb : LiveData<List<BD>> = BDDao.getAllBD()

    suspend fun insertBD(bd:BD){
        BDDao.insertBD(bd)
    }
    public fun bdRepository(application: Application){
        val database:BDDatabase
    }
}