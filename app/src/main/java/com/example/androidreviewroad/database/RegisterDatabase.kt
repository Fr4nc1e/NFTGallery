package com.example.androidreviewroad.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.androidreviewroad.Dao.RegisterDao
import com.example.androidreviewroad.NftApplication
import com.example.androidreviewroad.model.Register

@Database(version = 1, entities = [Register::class])
abstract class RegisterDatabase : RoomDatabase() {

    abstract fun registerDao(): RegisterDao

    companion object {

        @Volatile
        private var INSTANCE: RegisterDatabase? = null

        fun getDatabase(): RegisterDatabase = INSTANCE ?: synchronized(this) {
            val instance = INSTANCE ?: Room
                .databaseBuilder(NftApplication.context, RegisterDatabase::class.java, "register_database")
                .build().also {
                    INSTANCE = it
                }
            instance
        }
    }
}
