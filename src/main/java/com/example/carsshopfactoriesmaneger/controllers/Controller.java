package com.example.carsshopfactoriesmaneger.controllers;


import com.example.carsshopfactoriesmaneger.dto.carDto.CarDto;
import com.example.carsshopfactoriesmaneger.dto.carDto.CarRequestDto;
import com.example.carsshopfactoriesmaneger.dto.carDto.CarSearchParametrs;
import com.example.carsshopfactoriesmaneger.dto.factoryDto.FactoryDto;
import com.example.carsshopfactoriesmaneger.dto.factoryDto.FactoryRequestDto;
import com.example.carsshopfactoriesmaneger.model.Car;
import com.example.carsshopfactoriesmaneger.model.Factory;
import com.example.carsshopfactoriesmaneger.repository.criteriaSpec.CarSpecificationBuilder;
import com.example.carsshopfactoriesmaneger.service.CarService;
import com.example.carsshopfactoriesmaneger.service.FactoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//**********//Main controller//**********//
@RequiredArgsConstructor
@RestController
@RequestMapping("/controller")
public class Controller {
    private final CarService carService;
    private final FactoryService factoryService;
    private final CarSpecificationBuilder carSpecificationBuilder;
    @PostMapping("/car")
    public CarDto createCar(@RequestBody CarRequestDto car){
        return carService.save(car);
    }

    @PostMapping("/factory")
    public FactoryDto createFactory(@RequestBody @Valid FactoryRequestDto factory){
        return factoryService.save(factory);
    }

    @GetMapping("/cars")
    public List<CarDto> getCars(){
        return carService.findAll();
    }

    @GetMapping("/factories")
    public List<FactoryDto> getFactories(){
        return factoryService.findAll();
    }

    @GetMapping("/cars/search")
    public List<CarDto> search(CarSearchParametrs carSearchParametrs){
        return carService.findAll(carSearchParametrs);
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
