package com.example.jsonconvert

import com.google.gson.annotations.SerializedName

data class PersonModel(
    val id: String,
    val email: String,
    val roles: List<String>,
    val apiKey: String,
    val profile: PersonProfile,
    val username: String,
    val createdAt: String,
    val updatedAt: String
)

data class PersonProfile(
    val dob: String,
    val name: String,
    val about: String,
    val address: String,
    val company: String,
    val location: PersonLocation
)

data class PersonLocation(
    val lat: Double,
    val long: Double
)

