package rab.hadrian.keepmoney.dto

import java.math.BigDecimal

data class TransactionRequest(
    val userId: Long,
    val amount: BigDecimal,
    val description: String?,
    val transactionType: String
)