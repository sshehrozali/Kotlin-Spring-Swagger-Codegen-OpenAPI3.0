package io.swagger.api

import javax.xml.bind.annotation.XmlTransient

@Generated(value = ["io.swagger.codegen.languages.SpringCodegen"], date = "2022-06-30T07:35:56.931Z")
@javax.xml.bind.annotation.XmlRootElement
class ApiResponseMessage {
    @get:XmlTransient
    var code = 0
    var type: String? = null
    var message: String? = null

    constructor() {}
    constructor(code: Int, message: String?) {
        this.code = code
        when (code) {
            ERROR -> type = "error"
            WARNING -> type = "warning"
            INFO -> type = "info"
            OK -> type = "ok"
            TOO_BUSY -> type = "too busy"
            else -> type = "unknown"
        }
        this.message = message
    }

    companion object {
        const val ERROR = 1
        const val WARNING = 2
        const val INFO = 3
        const val OK = 4
        const val TOO_BUSY = 5
    }
}