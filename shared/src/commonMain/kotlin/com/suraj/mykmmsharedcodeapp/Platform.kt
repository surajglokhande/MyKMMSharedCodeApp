package com.suraj.mykmmsharedcodeapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform