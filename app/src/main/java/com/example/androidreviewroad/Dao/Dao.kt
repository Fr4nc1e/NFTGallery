package com.example.androidreviewroad.Dao // ktlint-disable filename

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.androidreviewroad.model.NFT

@Dao
interface NftDao {

    @Insert
    fun insertNft(nft: NFT)

    @Update
    fun updateNft(newNFT: NFT)

    @Query("SELECT * FROM NFT")
    fun getAllNft(): List<NFT>

    @Query("SELECT * FROM NFT WHERE name = :name")
    fun inDatabase(name: String): List<NFT>
}
