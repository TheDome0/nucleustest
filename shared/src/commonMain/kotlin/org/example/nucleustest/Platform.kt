package org.example.nucleustest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform