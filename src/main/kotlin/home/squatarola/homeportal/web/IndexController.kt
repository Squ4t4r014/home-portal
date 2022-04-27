package home.squatarola.homeportal.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@Controller
@RequestMapping("/")
class IndexController {
    @RequestMapping(method = [RequestMethod.GET])
    fun index(): String {
        return "index"
    }
}