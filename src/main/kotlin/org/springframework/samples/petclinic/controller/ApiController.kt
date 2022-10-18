package org.springframework.samples.petclinic.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigInteger

@RestController
@RequestMapping("/api/stress")
class ApiController {

    @GetMapping("/{number}")
    fun stress(@PathVariable number: Int): BigInteger {
        return calculateFactorialInMainThreadUsingYield(number)
    }

    private fun calculateFactorialInMainThreadUsingYield(number: Int): BigInteger {
        var factorial = BigInteger.ONE
        for (i in 1..number) {
            // factorial = factorial * i;
            factorial = factorial.multiply(BigInteger.valueOf(i.toLong()))
        }
        return factorial
    }
}
