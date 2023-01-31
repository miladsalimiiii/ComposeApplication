package com.example.composeapplication.di

import com.example.composeapplication.feature.note.presentation.add_edit_note.AddEditNoteViewModel
import com.example.composeapplication.feature.note.presentation.notes.NotesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { NotesViewModel(get()) }
    viewModel { AddEditNoteViewModel(get(),get()) }
}