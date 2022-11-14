package com.example.androidreviewroad.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.androidreviewroad.Dao.NftDao
import com.example.androidreviewroad.model.NFT

@Database(version = 1, entities = [NFT::class])
abstract class NftDatabase : RoomDatabase() {

    abstract fun nftDao(): NftDao

    companion object {

        private var instance: NftDatabase? = null

        @Synchronized
        fun getDatabase(context: Context): NftDatabase {
            instance?.let {
                return it
            }
            return Room.databaseBuilder(
                context.applicationContext,
                NftDatabase::class.java,
                "nft_database"
            )
                .build()
                .apply {
                    instance = this
                }
        }
    }
}
