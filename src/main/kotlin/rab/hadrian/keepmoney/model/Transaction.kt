package rab.hadrian.keepmoney.model

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import java.time.LocalDate

@Entity
data class Transaction(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @field:NotNull
    val valor: Double,

    @field:NotBlank
    val descricao: String,

    @field:NotNull
    val data: LocalDate,

    @field:NotBlank
    val tipo: String
)