package lexer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LexerServiceApplication

fun main(args: Array<String>) {
    runApplication<LexerServiceApplication>(*args)
}
