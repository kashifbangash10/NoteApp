//package com.example.noteappwithmvvm.NotesRepository
//
//import androidx.lifecycle.LiveData
//import com.example.roomdatabase.dao.NoteDao
//import com.example.roomdatabase.model.Notes
//
//class NotesRepository(private val noteDao: NoteDao) {
//
//    fun getAllNotes(): LiveData<List<Notes>> {
//        return noteDao.getAllNotes()
//    }
//
//    suspend fun insertNotes(notes: Notes) {
//        noteDao.insertNote(notes)
//    }
//
//    suspend fun deleteNotes(id: Int) {
//        noteDao.deleteNote(id)
//    }
//
//    suspend fun updateNotes(notes: Notes) {
//        noteDao.updateNote(notes)
//    }
//}
