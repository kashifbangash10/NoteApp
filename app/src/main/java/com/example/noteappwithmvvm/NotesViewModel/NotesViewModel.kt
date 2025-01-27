//package com.example.noteappwithmvvm.NotesViewModel
//
//import android.app.Application
//import androidx.lifecycle.AndroidViewModel
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.viewModelScope
//import com.example.noteappwithmvvm.NotesRepository.NotesRepository
//import com.example.roomdatabase.db.NotesDb
//import com.example.roomdatabase.model.Notes
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.launch
//
//class NotesViewModel(application: Application) : AndroidViewModel(application) {
//
//    private val notesRepository: NotesRepository
//
//    init {
//        val dao = NotesDb.createDbInstance(application).noteDao()
//        notesRepository = NotesRepository(dao)
//    }
//
//    fun addNotes(notes: Notes) {
//        viewModelScope.launch(Dispatchers.IO) {
//            notesRepository.insertNotes(notes)
//        }
//    }
//
//    fun getAllNotes(): LiveData<List<Notes>> {
//        return notesRepository.getAllNotes()
//    }
//
//    fun deleteNotes(id: Int) {
//        viewModelScope.launch(Dispatchers.IO) {
//            notesRepository.deleteNotes(id)
//        }
//    }
//
//    fun updateNotes(notes: Notes) {
//        viewModelScope.launch(Dispatchers.IO) {
//            notesRepository.updateNotes(notes)
//        }
//    }
//}
