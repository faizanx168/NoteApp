package com.example.noteapp

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import java.util.concurrent.Flow

class Repository(private val notesDao: NotesDao) {
    val allNotes: LiveData<List<Note>> = notesDao.getAllNotes()
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(note: Note) {
        notesDao.insert(note)
    }
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun delete(note: Note){
        notesDao.delete(note)
    }
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun update(note: Note){
        notesDao.update(note)
    }
}