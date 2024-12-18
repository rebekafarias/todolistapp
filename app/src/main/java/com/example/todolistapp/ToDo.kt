package com.example.todolistapp

import java.time.Instant
import java.util.Date

data class ToDo(
    var id: Int,
    var title: String,
    var createdAt: Date
)

fun getFakeToDo(): List<ToDo> {
    return listOf(
        ToDo(1, "First To Do", Date.from(Instant.now())),
    )
}
