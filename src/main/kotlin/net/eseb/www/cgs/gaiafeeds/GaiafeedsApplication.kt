package net.eseb.www.cgs.gaiafeeds

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GaiafeedsApplication

fun main(args: Array<String>) {
	runApplication<GaiafeedsApplication>(*args)
}
