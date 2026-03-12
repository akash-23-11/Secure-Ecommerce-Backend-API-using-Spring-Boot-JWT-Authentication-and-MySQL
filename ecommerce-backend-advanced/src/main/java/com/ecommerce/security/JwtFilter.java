
package com.ecommerce.security;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;

public class JwtFilter implements Filter {

 public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
  throws IOException, ServletException {

  HttpServletRequest req = (HttpServletRequest) request;
  String auth = req.getHeader("Authorization");
  chain.doFilter(request,response);
 }

}
