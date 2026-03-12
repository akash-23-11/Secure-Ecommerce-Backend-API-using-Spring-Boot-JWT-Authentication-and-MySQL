
package com.ecommerce.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

 @PostMapping("/login")
 public String login(){
  return "login success";
 }

}
