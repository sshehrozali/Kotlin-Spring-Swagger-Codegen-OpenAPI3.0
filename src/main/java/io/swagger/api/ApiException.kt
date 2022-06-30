package io.swagger.api

import javax.annotation.Generated

@Generated(value = ["io.swagger.codegen.languages.SpringCodegen"], date = "2022-06-30T07:35:56.931Z")
open class ApiException(private val code: Int, msg: String?) : Exception(msg)