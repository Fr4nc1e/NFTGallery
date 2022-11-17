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

    @Query("SELECT * FROM Register WHERE account = :account")
    fun inRegisterDatabase(account: Int): List<Register>

    @Query("SELECT * FROM Register WHERE account = :account and passWords = :passWd")
    fun inLoginDatabase(account: Int, passWd: Int): List<Register>
}
