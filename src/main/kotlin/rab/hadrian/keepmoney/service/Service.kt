package rab.hadrian.keepmoney.service

import org.springframework.stereotype.Service
import rab.hadrian.keepmoney.model.Transaction
import rab.hadrian.keepmoney.model.User
import rab.hadrian.keepmoney.repository.TransactionRepository
import rab.hadrian.keepmoney.repository.UserRepository

@Service
class TransactionService(private val repository: TransactionRepository) {
    fun findAll() = repository.findAll()
    fun save(transaction: Transaction) = repository.save(transaction)
    fun deleteById(id: Long) = repository.deleteById(id)
}

@Service
class UserService(private val repository: UserRepository) {
    fun save(user: User) = repository.save(user)
    fun findByName(name: String) = repository.findAll().find { it.name == name }
}