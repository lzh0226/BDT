package com.example.bdt

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface BDDao {
    @Insert
    suspend fun insertBD(bd: BD)

    @Update
    suspend fun updateDB(bd: BD)

    @Delete
    suspend fun deleteDB(bd: BD)

    @Query("SELECT * FROM birthday")
    fun getAllBD(): LiveData<List<BD>>

    @Query("SELECT * FROM birthday WHERE id = :ID")
    fun gatABD(ID: Int): BD
}