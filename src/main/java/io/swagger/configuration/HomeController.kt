package io.swagger.configuration

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Home redirection to swagger api documentation
 */
@Controller
class HomeController {
    @RequestMapping(value = ["/"])
    fun index(): String {
        System.out.println("swagger-ui.html")
        return "redirect:swagger-ui.html"
    }
}