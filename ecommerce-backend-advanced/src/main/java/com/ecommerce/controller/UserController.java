
package com.ecommerce.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

 @GetMapping
 public String users(){
  return "users api";
 }

}
