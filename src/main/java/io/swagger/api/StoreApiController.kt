package io.swagger.api

import io.swagger.model.Order
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import javax.servlet.http.HttpServletRequest
import javax.validation.constraints.Max
import javax.validation.constraints.Min

@Generated(value = ["io.swagger.codegen.languages.SpringCodegen"], date = "2022-06-30T07:35:56.931Z")
@Controller
class StoreApiController @Autowired constructor(objectMapper: ObjectMapper, request: HttpServletRequest) : StoreApi {
    private val objectMapper: ObjectMapper
    private val request: HttpServletRequest

    init {
        this.objectMapper = objectMapper
        this.request = request
    }

    override fun deleteOrder(
        @Min(1L) @ApiParam(
            value = "ID of the order that needs to be deleted",
            required = true
        ) @PathVariable("orderId") orderId: Long?
    ): ResponseEntity<Void?> {
        val accept: String = request.getHeader("Accept")
        return ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED)
    }

    override val inventory: ResponseEntity<Map<String?, Integer?>?>
        get() {
            val accept: String? = request.getHeader("Accept")
            return if (accept != null && accept.contains("application/json")) {
                try {
                    ResponseEntity<Map<String, Integer>>(
                        objectMapper.readValue("{\"empty\": false}", Map::class.java),
                        HttpStatus.NOT_IMPLEMENTED
                    )
                } catch (e: IOException) {
                    log.error("Couldn't serialize response for content type application/json", e)
                    ResponseEntity<Map<String, Integer>>(HttpStatus.INTERNAL_SERVER_ERROR)
                }
            } else ResponseEntity<Map<String, Integer>>(HttpStatus.NOT_IMPLEMENTED)
        }

    override fun getOrderById(
        @Min(1L) @Max(10L) @ApiParam(
            value = "ID of pet that needs to be fetched",
            required = true
        ) @PathVariable("orderId") orderId: Long?
    ): ResponseEntity<Order?> {
        val accept: String? = request.getHeader("Accept")
        if (accept != null && accept.contains("application/xml")) {
            return try {
                ResponseEntity<Order>(
                    objectMapper.readValue(
                        "<Order>  <id>123456789</id>  <petId>123456789</petId>  <quantity>123</quantity>  <shipDate>2000-01-23T04:56:07.000Z</shipDate>  <status>aeiou</status>  <complete>true</complete></Order>",
                        Order::class.java
                    ), HttpStatus.NOT_IMPLEMENTED
                )
            } catch (e: IOException) {
                log.error("Couldn't serialize response for content type application/xml", e)
                ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR)
            }
        }
        return if (accept != null && accept.contains("application/json")) {
            try {
                ResponseEntity<Order>(
                    objectMapper.readValue("{\"empty\": false}", Order::class.java),
                    HttpStatus.NOT_IMPLEMENTED
                )
            } catch (e: IOException) {
                log.error("Couldn't serialize response for content type application/json", e)
                ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR)
            }
        } else ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED)
    }

    override fun placeOrder(
        @ApiParam(
            value = "order placed for purchasing the pet",
            required = true
        ) @Valid @RequestBody body: Order?
    ): ResponseEntity<Order?> {
        val accept: String? = request.getHeader("Accept")
        if (accept != null && accept.contains("application/xml")) {
            return try {
                ResponseEntity<Order>(
                    objectMapper.readValue(
                        "<Order>  <id>123456789</id>  <petId>123456789</petId>  <quantity>123</quantity>  <shipDate>2000-01-23T04:56:07.000Z</shipDate>  <status>aeiou</status>  <complete>true</complete></Order>",
                        Order::class.java
                    ), HttpStatus.NOT_IMPLEMENTED
                )
            } catch (e: IOException) {
                log.error("Couldn't serialize response for content type application/xml", e)
                ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR)
            }
        }
        return if (accept != null && accept.contains("application/json")) {
            try {
                ResponseEntity<Order>(
                    objectMapper.readValue("{\"empty\": false}", Order::class.java),
                    HttpStatus.NOT_IMPLEMENTED
                )
            } catch (e: IOException) {
                log.error("Couldn't serialize response for content type application/json", e)
                ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR)
            }
        } else ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        private val log: Logger = LoggerFactory.getLogger(StoreApiController::class.java)
    }
}