package com.revature.p1demo.service;

import com.revature.p1demo.dao.CarDAO;
import com.revature.p1demo.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private CarDAO carDAO;

    @Autowired
    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public Car addNewCar(Car newCar){
        return carDAO.save(newCar);
    }

    public List<Car> getAllCars(){
        return carDAO.findAll();
    }
}
