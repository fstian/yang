package com.kt.model

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey


@Entity(indices = [Index(value = ["uuid"], unique = true)])
data class Account(
        val type: String,
        val dept: String,
        val account: String,
        val pwd: String,
        val des: String) {

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0

    val uuid: String = account + System.currentTimeMillis()

}