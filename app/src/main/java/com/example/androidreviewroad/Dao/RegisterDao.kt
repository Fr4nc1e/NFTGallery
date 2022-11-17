package com.example.androidreviewroad.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.androidreviewroad.model.Register

@Dao
interface RegisterDao {

    @Insert
    fun insertRegister(register: Register)

    @Update
    fun updateRegister(newRegister: Register)

    @Query("SELECT * FROM Register")
    fun getAllRegister(): List<Register>
}
