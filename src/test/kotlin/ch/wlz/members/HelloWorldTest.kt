package ch.wlz.members

import kotlin.test.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.test.context.TestConstructor
import org.springframework.test.context.TestConstructor.AutowireMode
import org.springframework.test.web.reactive.server.WebTestClient

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestConstructor(autowireMode = AutowireMode.ALL)
class HelloWorldTest(
    @LocalServerPort private val port: Int
) {

    @Test
    fun hello_returns_hello_world() {
        val client = WebTestClient
            .bindToServer()
            .baseUrl("http://localhost:$port")
            .build()

        client
            .get()
            .uri("/hello")
            .exchange()
            .expectStatus().isOk
            .expectBody(String::class.java)
            .isEqualTo("Hello, world!")
    }
}
