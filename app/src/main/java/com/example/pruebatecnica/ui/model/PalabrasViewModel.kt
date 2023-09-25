package com.example.pruebatecnica.ui.model

import androidx.lifecycle.ViewModel
import com.example.pruebatecnica.domain.ObtenerPalabrasCasoDeUso
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class PalabrasViewModel @Inject constructor(var obtenerPalabras:ObtenerPalabrasCasoDeUso): ViewModel() {

    private val _state  = MutableStateFlow<UIState>(UIState.Loading)
    val  state: StateFlow<UIState> = _state


    fun obtenerPalabrasDelViewModel(){

        viewmodelScope(){
            obtenerPalabras()
        }

    }



}