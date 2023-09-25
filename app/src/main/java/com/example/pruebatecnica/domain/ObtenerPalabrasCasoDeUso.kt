package com.example.pruebatecnica.domain

import com.example.pruebatecnica.data.repository.PalabrasRepository
import javax.inject.Inject

class ObtenerPalabrasCasoDeUso @Inject constructor(val palabrasRepository: PalabrasRepository) {
    suspend operator fun invoke () = palabrasRepository.obtenerPalabras()
}