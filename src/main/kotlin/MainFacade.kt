class MainFacade(
    private val useCaseService1: UseCaseService1,
    private val useCaseService2: UseCaseService2,
    private val useCaseService3: UseCaseService3
) {

    fun useCaseService1() = useCaseService1.useCaseService1()
    fun useCaseService2() = useCaseService2.useCaseService2()
    fun useCaseService3() = useCaseService3.useCaseService3()

}

class UseCaseService1(private val reusedService: ReusedService) {
    fun useCaseService1() = "specific usecase 1 with ${reusedService.reusableMethod()}"
}

class UseCaseService2(private val reusedService: ReusedService) {
    fun useCaseService2() = "specific usecase 2 with ${reusedService.reusableMethod()}"
}

class UseCaseService3 {
    fun useCaseService3() = "specific usecase 3"
}

class ReusedService {
    fun reusableMethod(): String {
        return "1"
    }
}