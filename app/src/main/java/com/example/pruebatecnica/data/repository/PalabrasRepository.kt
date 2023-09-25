package com.example.pruebatecnica.data.repository

import com.example.pruebatecnica.data.network.ServiceInterface
import javax.inject.Inject


class PalabrasRepository @Inject constructor(val serviceInterface: ServiceInterface) {

   suspend fun obtenerPalabras():List<String>{
       return serviceInterface.listPalabras()
    }

}