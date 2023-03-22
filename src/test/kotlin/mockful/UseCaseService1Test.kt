package mockful

import ReusedService
import UseCaseService1
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock
import org.mockito.kotlin.times
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever
import kotlin.test.assertEquals

class UseCaseService1Test {
    lateinit var reusedService: ReusedService
    lateinit var useCaseService1: UseCaseService1

    @BeforeEach
    fun setup() {
        reusedService = mock(ReusedService::class.java)
        useCaseService1 = UseCaseService1(reusedService)
    }

    @Test
    fun testUseCase1() {
        // Given
        whenever(reusedService.reusableMethod()).thenReturn("reused result")

        // When
        val result = useCaseService1.useCaseService1()

        // Then
        assertEquals("specific usecase 1 with reused result", result)
        verify(reusedService, times(1)).reusableMethod()
    }

}