package com.example.androidreviewroad.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Register(
    val account: Int,
    val passWords: Int,
    val phoneNumber: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
