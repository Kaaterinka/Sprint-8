package ru.sberschool.hystrix

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class PokeApi(
    @JsonProperty("name")
    val data: String
)
