package mockful

import UseCaseService3
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class UseCaseService3Test {
    lateinit var useCaseService3: UseCaseService3

    @BeforeEach
    fun setup() {
        useCaseService3 = UseCaseService3()
    }

    @Test
    fun testUseCase3() {
        // When
        val result = useCaseService3.useCaseService3()

        // Then
        assertEquals("specific usecase 3", result)
    }

}