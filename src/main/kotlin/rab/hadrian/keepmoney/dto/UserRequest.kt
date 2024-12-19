package rab.hadrian.keepmoney.dto

data class UserRequest(
    val username: String,
    val email: String?,
    val password: String
)