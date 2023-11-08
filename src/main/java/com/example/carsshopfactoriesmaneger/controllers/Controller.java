package com.example.carsshopfactoriesmaneger.controllers;


import com.example.carsshopfactoriesmaneger.dto.carDto.CarDto;
import com.example.carsshopfactoriesmaneger.model.Car;
import com.example.carsshopfactoriesmaneger.model.Factory;
import com.example.carsshopfactoriesmaneger.service.CarService;
import com.example.carsshopfactoriesmaneger.service.FactoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/controller")
public class Controller {
    private final CarService carService;
    private final FactoryService factoryService;

    @PostMapping("/car")
    public CarDto createCar(@RequestBody Car car){
        return carService.save(car);
    }

    @PostMapping("/factory")
    public Factory createCar(@RequestBody Factory factory){
        return factoryService.save(factory);
    }

    @GetMapping("/cars")
    public List<CarDto> getCars(){
        return carService.findAll();
    }

    @GetMapping("/factories")
    public List<Factory> getFactories(){
        return factoryService.findAll();
    }

    @DeleteMapping("/cars/delete/{id}")
    public void deleteCar(@PathVariable Integer id){
        carService.deleteByID(id);
    }

    @DeleteMapping("/factories/delete/{id}")
    public void deleteFactory(@PathVariable Integer id){
        factoryService.deleteByID(id);
    }
}
