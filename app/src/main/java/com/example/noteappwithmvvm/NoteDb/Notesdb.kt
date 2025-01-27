//package com.example.roomdatabase.db
//
//import android.content.Context
//import androidx.room.Database
//import androidx.room.Room
//import androidx.room.RoomDatabase
//import com.example.roomdatabase.dao.NoteDao
//import com.example.roomdatabase.model.Notes
//import kotlinx.coroutines.InternalCoroutinesApi
//import kotlinx.coroutines.internal.synchronized
//
//@Database(entities = [Notes::class], version = 2)
//abstract class NotesDb : RoomDatabase() {
//
//    abstract fun noteDao(): NoteDao
//
//    companion object {
//        private const val DATABASE_NAME = "NOTES" // Name of the database
//
//        @Volatile
//        private var instance: NotesDb? = null
//
//        // Function to create or retrieve the database instance
//        @OptIn(InternalCoroutinesApi::class)
//        fun createDbInstance(context: Context): NotesDb {
//            return instance ?: synchronized(this) {
//                instance ?: Room.databaseBuilder(
//                    context.applicationContext,
//                    NotesDb::class.java,
//                    DATABASE_NAME
//                ).build().also { instance = it }
//            }
//        }
//    }
//}
