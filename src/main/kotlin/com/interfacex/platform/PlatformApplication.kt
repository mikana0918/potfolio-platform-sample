package com.interfacex.platform

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.support.beans
import org.springframework.web.servlet.function.router

@SpringBootApplication
class PlatformApplication

fun main(args: Array<String>) {
	runApplication<PlatformApplication>(*args)
}
