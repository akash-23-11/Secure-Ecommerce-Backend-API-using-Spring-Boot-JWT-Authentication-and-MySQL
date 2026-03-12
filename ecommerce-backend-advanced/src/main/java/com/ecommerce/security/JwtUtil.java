
package com.ecommerce.security;

public class JwtUtil {

 public String generateToken(String username){
  return "dummy-jwt-token-" + username;
 }

}
