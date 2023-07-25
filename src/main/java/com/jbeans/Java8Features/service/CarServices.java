
package com.jbeans.Java8Features.service;

import com.jbeans.Java8Features.dto.Car;
import com.jbeans.Java8Features.repository.CarRepo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.parsers.DocumentBuilder;

import static java.util.Arrays.stream;

@Service
public class CarServices {
    @Autowired
    CarRepo carRepo;

    public List<Car> getCarList() {
        List<Car> carList = carRepo.findAll();
        return carList;
    }

    public void displayCar() {
        List<Car> carList = carRepo.findAll();
      //  if(<Optional>)
        Map<String, List<Car>> groupbyName = (Map)carList.stream().collect(Collectors.groupingBy(Car::getName));
        System.out.println(groupbyName);
        Map<String, Long> groupNameCount = (Map)carList.stream().collect(Collectors.groupingBy(Car::getName, Collectors.counting()));
        System.out.println(groupNameCount);
        Map<String, Double> groupavgprice = (Map)carList.stream().collect(Collectors.groupingBy(Car::getName, Collectors.averagingDouble(Car::getPrice)));
        System.out.println(groupavgprice);

         Map<String,Car> filteredcar=groupbyName.entrySet()
                 .stream()
                 .collect(Collectors.toMap(Map.Entry::getKey,e ->e.getValue().stream().max(Comparator.comparing(Car::getPrice)).get()));
         Set<String> brands=filteredcar.keySet();
         Car topcar= (Car) brands.stream().map(k->filteredcar.get(k)).toList().get(0);
        System.out.println("Car :: "+ topcar.toString());

    }

    public List<Car> top3(){
        List<Car> carlist=carRepo.findAll();
        List<Car> sortcarprice=carlist.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .toList();
        List<Car> top3carprice=sortcarprice.stream().limit(3)
                .skip(1)
                .collect(Collectors.toList());
        return top3carprice;
    }
}
