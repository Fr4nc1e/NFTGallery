package com.example.androidreviewroad.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NFT(
    val name: String,
    val imageId: Int,
    val price: Int,
    val artist: String,
    val des: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}
