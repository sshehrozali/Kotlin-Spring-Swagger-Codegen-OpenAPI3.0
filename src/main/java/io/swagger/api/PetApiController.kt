package io.swagger.api

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import java.io.IOException
import javax.servlet.http.HttpServletRequest
import javax.validation.constraints.NotNull

@Generated(value = ["io.swagger.codegen.languages.SpringCodegen"], date = "2022-06-30T07:35:56.931Z")
@Controller
class PetApiController @Autowired constructor(objectMapper: ObjectMapper, request: HttpServletRequest) : PetApi {
    private val objectMapper: ObjectMapper
    private val request: HttpServletRequest

    init {
        this.objectMapper = objectMapper
        this.request = request
    }

    override fun addPet(
        @ApiParam(
            value = "Pet object that needs to be added to the store",
            required = true
        ) @Valid @RequestBody body: Pet?
    ): ResponseEntity<Void?> {
        val accept: String = request.getHeader("Accept")
        return ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED)
    }

    override fun deletePet(
        @ApiParam(value = "Pet id to delete", required = true) @PathVariable("petId") petId: Long?,
        @ApiParam(value = "") @RequestHeader(value = "api_key", required = false) apiKey: String?
    ): ResponseEntity<Void?> {
        val accept: String = request.getHeader("Accept")
        return ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED)
    }

    override fun findPetsByStatus(
        @NotNull @ApiParam(
            value = "Status values that need to be considered for filter",
            required = true,
            allowableValues = "available, pending, sold"
        ) @Valid @RequestParam(value = "status", required = true) status: List<String?>?
    ): ResponseEntity<List<Pet?>?> {
        val accept: String? = request.getHeader("Accept")
        if (accept != null && accept.contains("application/xml")) {
            return try {
                ResponseEntity<List<Pet>>(
                    objectMapper.readValue(
                        "<Pet>  <id>123456789</id>  <name>doggie</name>  <photoUrls>    <photoUrls>aeiou</photoUrls>  </photoUrls>  <tags>  </tags>  <status>aeiou</status></Pet>",
                        List::class.java
                    ), HttpStatus.NOT_IMPLEMENTED
                )
            } catch (e: IOException) {
                log.error("Couldn't serialize response for content type application/xml", e)
                ResponseEntity<List<Pet>>(HttpStatus.INTERNAL_SERVER_ERROR)
            }
        }
        return if (accept != null && accept.contains("application/json")) {
            try {
                ResponseEntity<List<Pet>>(objectMapper.readValue("{}", List::class.java), HttpStatus.NOT_IMPLEMENTED)
            } catch (e: IOException) {
                log.error("Couldn't serialize response for content type application/json", e)
                ResponseEntity<List<Pet>>(HttpStatus.INTERNAL_SERVER_ERROR)
            }
        } else ResponseEntity<List<Pet>>(HttpStatus.NOT_IMPLEMENTED)
    }

    override fun findPetsByTags(
        @NotNull @ApiParam(value = "Tags to filter by", required = true) @Valid @RequestParam(
            value = "tags",
            required = true
        ) tags: List<String?>?
    ): ResponseEntity<List<Pet?>?> {
        val accept: String? = request.getHeader("Accept")
        if (accept != null && accept.contains("application/xml")) {
            return try {
                ResponseEntity<List<Pet>>(
                    objectMapper.readValue(
                        "<Pet>  <id>123456789</id>  <name>doggie</name>  <photoUrls>    <photoUrls>aeiou</photoUrls>  </photoUrls>  <tags>  </tags>  <status>aeiou</status></Pet>",
                        List::class.java
                    ), HttpStatus.NOT_IMPLEMENTED
                )
            } catch (e: IOException) {
                log.error("Couldn't serialize response for content type application/xml", e)
                ResponseEntity<List<Pet>>(HttpStatus.INTERNAL_SERVER_ERROR)
            }
        }
        return if (accept != null && accept.contains("application/json")) {
            try {
                ResponseEntity<List<Pet>>(objectMapper.readValue("{}", List::class.java), HttpStatus.NOT_IMPLEMENTED)
            } catch (e: IOException) {
                log.error("Couldn't serialize response for content type application/json", e)
                ResponseEntity<List<Pet>>(HttpStatus.INTERNAL_SERVER_ERROR)
            }
        } else ResponseEntity<List<Pet>>(HttpStatus.NOT_IMPLEMENTED)
    }

    override fun getPetById(
        @ApiParam(
            value = "ID of pet to return",
            required = true
        ) @PathVariable("petId") petId: Long?
    ): ResponseEntity<Pet?> {
        val accept: String? = request.getHeader("Accept")
        if (accept != null && accept.contains("application/xml")) {
            return try {
                ResponseEntity<Pet>(
                    objectMapper.readValue(
                        "<Pet>  <id>123456789</id>  <name>doggie</name>  <photoUrls>    <photoUrls>aeiou</photoUrls>  </photoUrls>  <tags>  </tags>  <status>aeiou</status></Pet>",
                        Pet::class.java
                    ), HttpStatus.NOT_IMPLEMENTED
                )
            } catch (e: IOException) {
                log.error("Couldn't serialize response for content type application/xml", e)
                ResponseEntity<Pet>(HttpStatus.INTERNAL_SERVER_ERROR)
            }
        }
        return if (accept != null && accept.contains("application/json")) {
            try {
                ResponseEntity<Pet>(
                    objectMapper.readValue("{\"empty\": false}", Pet::class.java),
                    HttpStatus.NOT_IMPLEMENTED
                )
            } catch (e: IOException) {
                log.error("Couldn't serialize response for content type application/json", e)
                ResponseEntity<Pet>(HttpStatus.INTERNAL_SERVER_ERROR)
            }
        } else ResponseEntity<Pet>(HttpStatus.NOT_IMPLEMENTED)
    }

    override fun updatePet(
        @ApiParam(
            value = "Pet object that needs to be added to the store",
            required = true
        ) @Valid @RequestBody body: Pet?
    ): ResponseEntity<Void?> {
        val accept: String = request.getHeader("Accept")
        return ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED)
    }

    override fun updatePetWithForm(
        @ApiParam(
            value = "ID of pet that needs to be updated",
            required = true
        ) @PathVariable("petId") petId: Long?,
        @ApiParam(value = "Updated name of the pet") @RequestParam(
            value = "name",
            required = false
        ) name: String?,
        @ApiParam(value = "Updated status of the pet") @RequestParam(
            value = "status",
            required = false
        ) status: String?
    ): ResponseEntity<Void?> {
        val accept: String = request.getHeader("Accept")
        return ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED)
    }

    override fun uploadFile(
        @ApiParam(
            value = "ID of pet to update",
            required = true
        ) @PathVariable("petId") petId: Long?,
        @ApiParam(value = "Additional data to pass to server") @RequestParam(
            value = "additionalMetadata",
            required = false
        ) additionalMetadata: String?,
        @ApiParam(value = "file to upload") @Valid @RequestPart(
            value = "file",
            required = false
        ) file: MultipartFile?
    ): ResponseEntity<ModelApiResponse?> {
        val accept: String? = request.getHeader("Accept")
        return if (accept != null && accept.contains("application/json")) {
            try {
                ResponseEntity<ModelApiResponse>(
                    objectMapper.readValue(
                        "{\"empty\": false}",
                        ModelApiResponse::class.java
                    ), HttpStatus.NOT_IMPLEMENTED
                )
            } catch (e: IOException) {
                log.error("Couldn't serialize response for content type application/json", e)
                ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR)
            }
        } else ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        private val log: Logger = LoggerFactory.getLogger(PetApiController::class.java)
    }
}