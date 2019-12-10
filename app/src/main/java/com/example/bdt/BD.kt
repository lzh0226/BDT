package com.example.bdt

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "birthday")
class BD (@PrimaryKey(autoGenerate = true) val id: Int ,
    val name: String ,
    val dob: Date
)