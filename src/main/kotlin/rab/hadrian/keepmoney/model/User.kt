package rab.hadrian.keepmoney.model

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank

@Entity
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @field:NotBlank
    val name: String,

    @field:NotBlank
    val password: String
)