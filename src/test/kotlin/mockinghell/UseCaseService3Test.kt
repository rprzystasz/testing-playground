package mockinghell

import ReusedService
import UseCaseService3
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock
import org.mockito.kotlin.times
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever
import kotlin.test.assertEquals

class UseCaseService3Test {
    lateinit var useCaseService3: UseCaseService3

    @BeforeEach
    fun setup() {
        useCaseService3 = UseCaseService3()
    }

    @Test
    fun testUseCase1() {
        // When
        val result = useCaseService3.useCaseService3()

        // Then
        assertEquals("specific usecase 3", result)
    }

}