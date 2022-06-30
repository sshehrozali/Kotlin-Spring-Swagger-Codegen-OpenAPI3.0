package io.swagger.model

import java.util.Objects

/**
 * ModelApiResponse
 */
@Validated
@Generated(value = ["io.swagger.codegen.languages.SpringCodegen"], date = "2022-06-30T07:35:56.931Z")
class ModelApiResponse {
    @JsonProperty("code")
    private var code: Integer? = null

    /**
     * Get type
     * @return type
     */
    @get:ApiModelProperty(value = "")
    @JsonProperty("type")
    var type: String? = null

    /**
     * Get message
     * @return message
     */
    @get:ApiModelProperty(value = "")
    @JsonProperty("message")
    var message: String? = null
    fun code(code: Integer?): ModelApiResponse {
        this.code = code
        return this
    }

    /**
     * Get code
     * @return code
     */
    @ApiModelProperty(value = "")
    fun getCode(): Integer? {
        return code
    }

    fun setCode(code: Integer?) {
        this.code = code
    }

    fun type(type: String?): ModelApiResponse {
        this.type = type
        return this
    }

    fun message(message: String?): ModelApiResponse {
        this.message = message
        return this
    }

    @Override
    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }
        if (o == null || getClass() !== o.getClass()) {
            return false
        }
        val _apiResponse = o as ModelApiResponse
        return Objects.equals(this.code, _apiResponse.code) &&
                Objects.equals(type, _apiResponse.type) &&
                Objects.equals(message, _apiResponse.message)
    }

    @Override
    override fun hashCode(): Int {
        return Objects.hash(code, type, message)
    }

    @Override
    override fun toString(): String {
        val sb: StringBuilder = StringBuilder()
        sb.append("class ModelApiResponse {\n")
        sb.append("    code: ").append(toIndentedString(code)).append("\n")
        sb.append("    type: ").append(toIndentedString(type)).append("\n")
        sb.append("    message: ").append(toIndentedString(message)).append("\n")
        sb.append("}")
        return sb.toString()
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private fun toIndentedString(o: Any?): String {
        return o?.toString()?.replace("\n", "\n    ") ?: "null"
    }
}