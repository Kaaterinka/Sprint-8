package ru.sberschool.hystrix

class FallbackSlowlyApi : SlowlyApi {
   override fun getPokeApi() = PokeApi("Fallback")
}


