package com.example.androidreviewroad.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Register(
    val ID: String,
    val passWords: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
