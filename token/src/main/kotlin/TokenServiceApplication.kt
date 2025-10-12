package token

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TokenServiceApplication

fun main(args: Array<String>) {
    runApplication<TokenServiceApplication>(*args)
}
