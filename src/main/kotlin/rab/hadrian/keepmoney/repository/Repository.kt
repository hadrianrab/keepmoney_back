package rab.hadrian.keepmoney.repository

import org.springframework.data.jpa.repository.JpaRepository
import rab.hadrian.keepmoney.model.Transaction
import rab.hadrian.keepmoney.model.User

interface TransactionRepository : JpaRepository<Transaction, Long>

interface UserRepository : JpaRepository<User, Long>