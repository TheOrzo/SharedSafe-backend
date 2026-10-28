package info.hogh.managedsafe.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class BackendApplication

fun main(args: Array<String>) {
	runApplication<BackendApplication>(*args)
}
