package io.github.siyual_park.application.api.integration

import io.github.siyual_park.application.api.module
import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.withTestApplication
import org.junit.Test
import kotlin.test.assertEquals

class RootRoutesTests {
    @Test
    fun testGetRoot() {
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Get, "/").apply {
                assertEquals(response.content, "Hello, world!")
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }
}
