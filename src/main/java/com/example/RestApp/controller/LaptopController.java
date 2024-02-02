package com.example.RestApp.controller;

import com.example.RestApp.entity.Laptop;
import com.example.RestApp.model.LaptopModel;
import com.example.RestApp.service.LaptopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class LaptopController {
    private final LaptopService laptopService;

 @PostMapping(value = "/add", produces = "application/json")
    public Laptop saveLaptop (@RequestBody LaptopModel laptopModel) {
     return laptopService.save(laptopModel);
 }

 @GetMapping(value = "/all", produces = "application/json")
    public  List<LaptopModel> getAllLaptops() {
     return laptopService.getAllLaptops();
 }

 @DeleteMapping(value = "/delete/{id}", produces = "application/json")
    public List<LaptopModel> deleteLaptop(@PathVariable Long id) {
     return laptopService.deleteById(id);
 }

 @PutMapping(value = "/edit", produces = "application/json")
    public List<LaptopModel> editLaptop(@RequestBody LaptopModel laptopModel) {
     return laptopService.editLaptop(laptopModel);
 }

 @GetMapping(value = "/highestId", produces = "application/json")
    public ResponseEntity<LaptopModel> getHighestId() {
     return new ResponseEntity<>(laptopService.getHighestId(), HttpStatus.CREATED);
 }
 @GetMapping(value = "/get/{id}", produces = "application/json")
    public ResponseEntity<?> getLaptopById(@PathVariable Long id) {
     LaptopModel laptopModel = laptopService.getLaptopById(id);
     if (laptopModel == null){
         return new ResponseEntity<>("nu l-am gasit", HttpStatus.NOT_FOUND);
     }
     return new ResponseEntity<>(laptopModel, HttpStatus.OK);
 }




}
