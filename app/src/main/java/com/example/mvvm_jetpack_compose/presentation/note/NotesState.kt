package com.example.mvvm_jetpack_compose.presentation.note

import com.example.mvvm_jetpack_compose.domain.model.Note
import com.example.mvvm_jetpack_compose.domain.util.NoteOrder
import com.example.mvvm_jetpack_compose.domain.util.OrderType

data class NotesState(val notes: List<Note> = emptyList(),
                      val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
                      val isOrderSectionVisible: Boolean = false)
