package io.swagger.api

import io.swagger.model.User
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import javax.servlet.http.HttpServletRequest
import javax.validation.constraints.NotNull

@Generated(value = ["io.swagger.codegen.languages.SpringCodegen"], date = "2022-06-30T07:35:56.931Z")
@Controller
class UserApiController @Autowired constructor(objectMapper: ObjectMapper, request: HttpServletRequest) : UserApi {
    private val objectMapper: ObjectMapper
    private val request: HttpServletRequest

    init {
        this.objectMapper = objectMapper
        this.request = request
    }

    override fun createUser(
        @ApiParam(
            value = "Created user object",
            required = true
        ) @Valid @RequestBody body: User?
    ): ResponseEntity<Void?> {
        val accept: String = request.getHeader("Accept")
        return ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED)
    }

    override fun createUsersWithArrayInput(
        @ApiParam(
            value = "List of user object",
            required = true
        ) @Valid @RequestBody body: List<User?>?
    ): ResponseEntity<Void?> {
        val accept: String = request.getHeader("Accept")
        return ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED)
    }

    override fun createUsersWithListInput(
        @ApiParam(
            value = "List of user object",
            required = true
        ) @Valid @RequestBody body: List<User?>?
    ): ResponseEntity<Void?> {
        val accept: String = request.getHeader("Accept")
        return ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED)
    }

    override fun deleteUser(
        @ApiParam(
            value = "The name that needs to be deleted",
            required = true
        ) @PathVariable("username") username: String?
    ): ResponseEntity<Void?> {
        val accept: String = request.getHeader("Accept")
        return ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED)
    }

    override fun getUserByName(
        @ApiParam(
            value = "The name that needs to be fetched. Use user1 for testing. ",
            required = true
        ) @PathVariable("username") username: String?
    ): ResponseEntity<User?> {
        val accept: String? = request.getHeader("Accept")
        if (accept != null && accept.contains("application/xml")) {
            return try {
                ResponseEntity<User>(
                    objectMapper.readValue(
                        "<User>  <id>123456789</id>  <username>aeiou</username>  <firstName>aeiou</firstName>  <lastName>aeiou</lastName>  <email>aeiou</email>  <password>aeiou</password>  <phone>aeiou</phone>  <userStatus>123</userStatus></User>",
                        User::class.java
                    ), HttpStatus.NOT_IMPLEMENTED
                )
            } catch (e: IOException) {
                log.error("Couldn't serialize response for content type application/xml", e)
                ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR)
            }
        }
        return if (accept != null && accept.contains("application/json")) {
            try {
                ResponseEntity<User>(
                    objectMapper.readValue("{\"empty\": false}", User::class.java),
                    HttpStatus.NOT_IMPLEMENTED
                )
            } catch (e: IOException) {
                log.error("Couldn't serialize response for content type application/json", e)
                ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR)
            }
        } else ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED)
    }

    override fun loginUser(
        @NotNull @ApiParam(value = "The user name for login", required = true) @Valid @RequestParam(
            value = "username",
            required = true
        ) username: String?,
        @NotNull @ApiParam(
            value = "The password for login in clear text",
            required = true
        ) @Valid @RequestParam(value = "password", required = true) password: String?
    ): ResponseEntity<String?> {
        val accept: String? = request.getHeader("Accept")
        if (accept != null && accept.contains("application/xml")) {
            return try {
                ResponseEntity<String>(objectMapper.readValue("aeiou", String::class.java), HttpStatus.NOT_IMPLEMENTED)
            } catch (e: IOException) {
                log.error("Couldn't serialize response for content type application/xml", e)
                ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR)
            }
        }
        return if (accept != null && accept.contains("application/json")) {
            try {
                ResponseEntity<String>(
                    objectMapper.readValue(
                        "{  \"bytes\": [],  \"empty\": true}",
                        String::class.java
                    ), HttpStatus.NOT_IMPLEMENTED
                )
            } catch (e: IOException) {
                log.error("Couldn't serialize response for content type application/json", e)
                ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR)
            }
        } else ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED)
    }

    override fun logoutUser(): ResponseEntity<Void?> {
        val accept: String = request.getHeader("Accept")
        return ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED)
    }

    override fun updateUser(
        @ApiParam(
            value = "name that need to be updated",
            required = true
        ) @PathVariable("username") username: String?,
        @ApiParam(value = "Updated user object", required = true) @Valid @RequestBody body: User?
    ): ResponseEntity<Void?> {
        val accept: String = request.getHeader("Accept")
        return ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        private val log: Logger = LoggerFactory.getLogger(UserApiController::class.java)
    }
}