package com.yzq.tutor.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author yzqde
 * @date time 2022/10/26 20:33
 * @modified By:
 *
 */
@RestController
@RequestMapping("/home")
class HelloController {
    @GetMapping("/hello")
    fun hello():String{
        return  "hello world"
    }
}