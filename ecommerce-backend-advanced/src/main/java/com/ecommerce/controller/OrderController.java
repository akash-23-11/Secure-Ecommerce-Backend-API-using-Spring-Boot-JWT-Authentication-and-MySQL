
package com.ecommerce.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

 @GetMapping
 public String orders(){
  return "orders api";
 }

}
