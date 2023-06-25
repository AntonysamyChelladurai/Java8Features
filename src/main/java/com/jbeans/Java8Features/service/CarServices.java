
package com.jbeans.Java8Features.service;

import com.jbeans.Java8Features.dto.Car;
import com.jbeans.Java8Features.repository.CarRepo;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServices {
    @Autowired
    CarRepo carRepo;

    public CarServices() {
    }

    public List<Car> getCarList() {
        List<Car> carList = this.carRepo.findAll();
        return carList;
    }

    public void displayCar() {
        List<Car> carList = this.carRepo.findAll();
        Map<String, List<Car>> groupbyName = (Map)carList.stream().collect(Collectors.groupingBy(Car::getName));
        System.out.println(groupbyName);
        Map<String, Long> groupNameCount = (Map)carList.stream().collect(Collectors.groupingBy(Car::getName, Collectors.counting()));
        System.out.println(groupNameCount);
        Map<String, Double> groupavgprice = (Map)carList.stream().collect(Collectors.groupingBy(Car::getName, Collectors.averagingDouble(Car::getPrice)));
        System.out.println(groupavgprice);
    }
}
