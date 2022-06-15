package com.github.imanaijan.chatapp.presentation.chat

import com.github.imanaijan.chatapp.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
)
