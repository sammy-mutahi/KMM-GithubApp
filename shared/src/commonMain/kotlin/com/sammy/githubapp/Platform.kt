package com.sammy.githubapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform