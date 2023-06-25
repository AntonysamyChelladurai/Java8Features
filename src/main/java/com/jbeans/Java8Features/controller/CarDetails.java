
package com.jbeans.Java8Features.controller;

import com.jbeans.Java8Features.dto.Car;
import com.jbeans.Java8Features.service.CarServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/car"})
public class CarDetails {
    @Autowired
    CarServices carServices;

    public CarDetails() {
    }

    @GetMapping({"/AllCars"})
    public List<Car> getAllCar() {
        return this.carServices.getCarList();
    }

    @GetMapping({"/CarData"})
    public void displayCar() {
        this.carServices.displayCar();
    }
}
