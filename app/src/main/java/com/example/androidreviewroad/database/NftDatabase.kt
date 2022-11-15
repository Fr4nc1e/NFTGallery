package com.example.androidreviewroad.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.androidreviewroad.Dao.NftDao
import com.example.androidreviewroad.NftApplication
import com.example.androidreviewroad.model.NFT

@Database(version = 1, entities = [NFT::class])
abstract class NftDatabase : RoomDatabase() {

    abstract fun nftDao(): NftDao

    companion object {

        @Volatile
        private var INSTANCE: NftDatabase? = null

        fun getDatabase(): NftDatabase = INSTANCE ?: synchronized(this) {
            val instance = INSTANCE ?: Room
                .databaseBuilder(NftApplication.context, NftDatabase::class.java, "nft_database")
                .build().also {
                    INSTANCE = it
                }
            instance
        }
    }
}
