package rab.hadrian.keepmoney

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KeepMoneyApplication

fun main(args: Array<String>) {
	runApplication<KeepMoneyApplication>(*args)
}