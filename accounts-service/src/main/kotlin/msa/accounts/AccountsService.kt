package msa.accounts

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class AccountsService {
}

fun main(args: Array<String>) {
    runApplication<AccountsService>(*args)
}