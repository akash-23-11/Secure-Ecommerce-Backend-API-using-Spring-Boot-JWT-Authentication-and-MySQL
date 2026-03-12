package com.ecommerce.controller;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {

 @Autowired
 private ProductRepository repo;

 @PostMapping
 public Product create(@RequestBody Product product){
  return repo.save(product);
 }

 @GetMapping
 public List<Product> getAll(){
  return repo.findAll();
 }

 @DeleteMapping("/{id}")
 public void delete(@PathVariable Long id){
  repo.deleteById(id);
 }
}