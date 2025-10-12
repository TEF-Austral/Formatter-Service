package formatter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FormatterServiceApplication

fun main(args: Array<String>) {
    runApplication<FormatterServiceApplication>(*args)
}
