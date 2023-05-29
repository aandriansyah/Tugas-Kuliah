package com.example.catatan10120046

import com.example.catatan10120046.database.Note

//10120046 - Andriansyah IF-2
interface OnClickItemListener{
    fun onEditNote(note: Note)
    fun onDeleteNote(note: Note)
    fun onUpdateNote()
}