package com.revature.p1demo.controller;

import com.revature.p1demo.model.Car;
import com.revature.p1demo.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {


    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @PostMapping
    public ResponseEntity<Car> addNewCar(@RequestBody Car car){

        Car newCar = carService.addNewCar(car);

        return ResponseEntity.status(201).body(newCar);
    }

    @GetMapping
    public ResponseEntity<List<Car>> getAllCars(){
        return ResponseEntity.ok(carService.getAllCars());
    }
}
