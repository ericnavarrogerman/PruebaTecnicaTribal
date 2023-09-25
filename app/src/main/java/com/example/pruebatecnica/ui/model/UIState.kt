package com.example.pruebatecnica.ui.model

sealed class UIState{
    object Loading:UIState()
    class Error():UIState()
    class Success():UIState()
}