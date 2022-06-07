package com.example.mvvm_jetpack_compose.presentation.note

import com.example.mvvm_jetpack_compose.domain.model.Note
import com.example.mvvm_jetpack_compose.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
