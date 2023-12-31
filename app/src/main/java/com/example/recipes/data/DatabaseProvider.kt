package com.example.recipes.data

import android.content.Context
import androidx.room.Room

object DatabaseProvider {
    private var appDatabase: AppDatabase? = null

    fun getDatabase(context: Context): AppDatabase {
        if (appDatabase == null) {
            appDatabase = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "fufuurecipes.db"
            ).build()
        }
        return appDatabase as AppDatabase
    }
}
