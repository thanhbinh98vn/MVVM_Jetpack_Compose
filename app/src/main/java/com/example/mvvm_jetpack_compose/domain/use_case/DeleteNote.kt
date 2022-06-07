package com.example.mvvm_jetpack_compose.domain.use_case

import com.example.mvvm_jetpack_compose.domain.model.Note
import com.example.mvvm_jetpack_compose.domain.repository.NoteRepository

class DeleteNote(private val repository: NoteRepository) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}