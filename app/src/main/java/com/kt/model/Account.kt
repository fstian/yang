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
        val des: String,
        val uuid:String) {

    @PrimaryKey(autoGenerate = true)
    var id: Int =0


}