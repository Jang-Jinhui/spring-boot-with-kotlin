package me.hackers.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/index")
class MainController {

    var name: String = "unknown"

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun index() = hashMapOf("name" to name)
}