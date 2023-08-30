package com.sevban.manueldiandroid.data.repository

import com.sevban.manueldiandroid.data.data_source.AuthApi
import com.sevban.manueldiandroid.domain.repository.AuthRepository

class AuthRepositoryImpl(
    private val authApi: AuthApi
): AuthRepository {
    override suspend fun login() {
        println("Logging in...")
    }
}