package rab.hadrian.keepmoney.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import rab.hadrian.keepmoney.model.Transaction
import rab.hadrian.keepmoney.model.User
import rab.hadrian.keepmoney.service.TransactionService
import rab.hadrian.keepmoney.service.UserService

@RestController
@RequestMapping("/transactions")
class TransactionController(private val service: TransactionService) {

    @GetMapping
    fun getAllTransactions() = service.findAll()

    @PostMapping
    fun createTransaction(@RequestBody transaction: Transaction) =
        ResponseEntity.ok(service.save(transaction))

    @DeleteMapping("/{id}")
    fun deleteTransaction(@PathVariable id: Long) =
        ResponseEntity.noContent().also { service.deleteById(id) }.build<Unit>()
}

@RestController
@RequestMapping("/users")
class UserController(private val service: UserService) {

    @PostMapping("/register")
    fun registerUser(@RequestBody user: User): ResponseEntity<User> =
        ResponseEntity.ok(service.save(user))
}