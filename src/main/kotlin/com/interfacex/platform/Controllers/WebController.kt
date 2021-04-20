package com.interfacex.platform.Controllers

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.ModelAndView

@SpringBootApplication
@RestController
class WebController {
    @GetMapping("/")
    fun top(): String {
        return "Hello Docker"
    }
}
