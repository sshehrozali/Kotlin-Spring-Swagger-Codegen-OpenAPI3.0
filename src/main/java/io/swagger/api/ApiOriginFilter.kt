package io.swagger.api

import java.io.IOException
import javax.servlet.Filter

@Generated(value = ["io.swagger.codegen.languages.SpringCodegen"], date = "2022-06-30T07:35:56.931Z")
class ApiOriginFilter : Filter {
    @Override
    @Throws(IOException::class, ServletException::class)
    override fun doFilter(
        request: ServletRequest, response: ServletResponse,
        chain: FilterChain
    ) {
        val res: HttpServletResponse = response as HttpServletResponse
        res.addHeader("Access-Control-Allow-Origin", "*")
        res.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
        res.addHeader("Access-Control-Allow-Headers", "Content-Type")
        chain.doFilter(request, response)
    }

    @Override
    override fun destroy() {
    }

    @Override
    @Throws(ServletException::class)
    override fun init(filterConfig: FilterConfig) {
    }
}