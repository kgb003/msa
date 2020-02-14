package msa.accounts

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@EnableEurekaClient
@SpringBootApplication
class AccountsService

fun main(args: Array<String>) {
    runApplication<AccountsService>(*args)
}

@RestController
class TestController(
    @Value("\${say.cheese}")
    private val say: String
) {

    @GetMapping("/say")
    fun say(): String {
        return say
    }
}