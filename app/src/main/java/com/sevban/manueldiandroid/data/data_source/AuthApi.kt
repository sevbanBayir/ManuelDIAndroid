package com.sevban.manueldiandroid.data.data_source

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface AuthApi {

    @POST("login")
    suspend fun login(
        @Body body: LoginRequest
    )
}

data class LoginRequest(
    val email: String,
    val password: String
)