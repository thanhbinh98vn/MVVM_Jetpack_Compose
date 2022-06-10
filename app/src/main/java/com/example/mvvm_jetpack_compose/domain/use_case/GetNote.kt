package com.example.mvvm_jetpack_compose.domain.use_case

import com.example.mvvm_jetpack_compose.domain.model.Note
import com.example.mvvm_jetpack_compose.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}