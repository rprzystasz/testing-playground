package mockinghell

import ReusedService
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReusedServiceTest {
    lateinit var reusedService: ReusedService

    @BeforeEach
    fun setup() {
        reusedService = ReusedService()
    }

    @Test
    fun testReusableMethod() {
        // When
        val result = reusedService.reusableMethod()

        // Then
        assertEquals("1", result)
    }

}