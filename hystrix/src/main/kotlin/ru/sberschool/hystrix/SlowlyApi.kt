package ru.sberschool.hystrix

import feign.RequestLine

interface SlowlyApi {
    @RequestLine("GET /pokemon/1")
    fun getPokeApi(): PokeApi
}


