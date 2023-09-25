package com.example.pruebatecnica.data.diproviders

import com.example.pruebatecnica.data.network.ServiceInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object PalabrasModule {

    @Provides
    fun privideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.chucknorris.io/")
            .build()
    }

    @Provides
    fun provideApiService(retrofit: Retrofit):ServiceInterface{
        return  retrofit.create(ServiceInterface::class.java)
    }

}