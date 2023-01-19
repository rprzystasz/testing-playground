class MainFacadeConfiguration {

    /*
    in more sophisticated apps, Ports would be passed here as parameters
     */
    fun mainFacadeModule(): MainFacade {
        val reusedService = ReusedService()
        return MainFacade(
            useCaseService1 = UseCaseService1(reusedService),
            useCaseService2 = UseCaseService2(reusedService),
            useCaseService3 = UseCaseService3()
        )
    }

}