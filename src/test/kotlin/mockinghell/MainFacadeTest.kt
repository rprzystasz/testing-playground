package mockinghell

import MainFacade
import UseCaseService1
import UseCaseService2
import UseCaseService3
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock
import org.mockito.kotlin.times
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever
import kotlin.test.assertEquals

class MainFacadeTest {

    lateinit var useCaseService1: UseCaseService1
    lateinit var useCaseService2: UseCaseService2
    lateinit var useCaseService3: UseCaseService3
    lateinit var mainFacade: MainFacade

    @BeforeEach
    fun setup() {
        useCaseService1 = mock(UseCaseService1::class.java)
        useCaseService2 = mock(UseCaseService2::class.java)
        useCaseService3 = mock(UseCaseService3::class.java)
        mainFacade = MainFacade(useCaseService1, useCaseService2, useCaseService3)
    }

    @Test
    fun testUseCase1() {
        // Given
        whenever(useCaseService1.useCaseService1()).thenReturn("result1")

        // When
        val result = mainFacade.useCaseService1()

        // Then
        assertEquals("result1", result)
        verify(useCaseService1, times(1)).useCaseService1()
    }

    @Test
    fun testUseCase2() {
        // Given
        whenever(useCaseService2.useCaseService2()).thenReturn("result2")

        // When
        val result = mainFacade.useCaseService2()

        // Then
        assertEquals("result2", result)
        verify(useCaseService2, times(1)).useCaseService2()
    }

    @Test
    fun testUseCase3() {
        // Given
        whenever(useCaseService3.useCaseService3()).thenReturn("result3")

        // When
        val result = mainFacade.useCaseService3()

        // Then
        assertEquals("result3", result)
        verify(useCaseService3, times(1)).useCaseService3()
    }
}