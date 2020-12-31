package com.motawfik.minigram.models

class NewUser {
    var fullName: String = ""
    var email: String = ""
    var password: String = ""
    var confirmPassword: String = ""

    fun addToFirestore(): HashMap<String, String> {
        return hashMapOf(
            "name" to fullName
        )
    }
}