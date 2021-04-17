package com.interfacex.platform.Controllers

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class WebController {
    @RequestMapping("/")
    fun index(): String {
        return "Hello Docker-san! Deploy Done!"
    }
}