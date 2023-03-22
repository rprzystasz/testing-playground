package mockful

import ReusedService
import UseCaseService2
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock
import org.mockito.kotlin.times
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever
import kotlin.test.assertEquals

class UseCaseService2Test {
    lateinit var reusedService: ReusedService
    lateinit var useCaseService2: UseCaseService2

    @BeforeEach
    fun setup() {
        reusedService = mock(ReusedService::class.java)
        useCaseService2 = UseCaseService2(reusedService)
    }

    @Test
    fun testUseCase2() {
        // Given
        whenever(reusedService.reusableMethod()).thenReturn("reused result")

        // When
        val result = useCaseService2.useCaseService2()

        // Then
        assertEquals("specific usecase 2 with reused result", result)
        verify(reusedService, times(1)).reusableMethod()
    }

}