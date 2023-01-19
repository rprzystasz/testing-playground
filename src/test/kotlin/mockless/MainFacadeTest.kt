package mockless

import MainFacade
import MainFacadeConfiguration
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

    lateinit var mainFacade: MainFacade

    @BeforeEach
    fun setup() {
        mainFacade = MainFacadeConfiguration().mainFacadeModule()
    }

    @Test
    fun testUseCase1() {
        // When
        val result = mainFacade.useCaseService1()

        // Then
        assertEquals("specific usecase 1 with 1", result)
    }

    @Test
    fun testUseCase2() {
        // When
        val result = mainFacade.useCaseService2()

        // Then
        assertEquals("specific usecase 2 with 1", result)
    }

    @Test
    fun testUseCase3() {
        // When
        val result = mainFacade.useCaseService3()

        // Then
        assertEquals("specific usecase 3", result)
    }
}