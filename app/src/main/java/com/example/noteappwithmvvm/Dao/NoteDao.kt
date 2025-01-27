//package com.example.roomdatabase.dao
//
//import androidx.lifecycle.LiveData
//import androidx.room.*
//import com.example.roomdatabase.model.Notes
//
//@Dao
//interface NoteDao {
//
//    // Insert a single note
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertNote(note: Notes )
//
//    // Update an existing note
//    @Update
//    suspend fun updateNote(note: Notes )
//
//    // Delete a specific note
//    @Delete
//    suspend fun deleteNote(note: Int)
//
//    // Delete all notes
//    @Query("DELETE FROM notes")
//    suspend fun deleteAllNotes()
//
//    // Fetch all notes ordered by date (most recent first)
//    @Query("SELECT * FROM notes ORDER BY date DESC")
//    fun getAllNotes(): LiveData<List<Notes>>
//
//    // Fetch a specific note by ID
//    @Query("SELECT * FROM notes WHERE id = :id")
//    suspend fun getNoteById(id: Int): Notes
//}
