package com.elasticache.cahce

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.beans.factory.annotation.Autowired


@Controller
@RequestMapping("cache")
class CacheController {

    @Autowired
    private val redisTemplate: StringRedisTemplate? = null

    @GetMapping("")
    fun index(hoge: String): String {
        redisTemplate!!.opsForValue()
                .set("hoge-string:string", hoge)
        redisTemplate.opsForValue()
                .set("hoge-string:map", hoge)
        return ""
    }
}