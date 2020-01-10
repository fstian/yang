package com.kt.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kt.model.Account


@Database(entities = arrayOf(Account::class), version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun accountDao(): AccountDao


    companion object {

        private const val dbName = "account.db"

        private var instance: AppDatabase? = null


        fun getInstance(context: Context): AppDatabase {

            return instance ?: synchronized(this) { instance ?: buildDatabase(context) }

        }

        fun buildDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, dbName).build()
        }


    }

}