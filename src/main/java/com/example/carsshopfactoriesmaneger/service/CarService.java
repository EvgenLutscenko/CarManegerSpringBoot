package com.example.carsshopfactoriesmaneger.service;


import com.example.carsshopfactoriesmaneger.dto.carDto.CarDto;
import com.example.carsshopfactoriesmaneger.model.Car;

import java.util.List;

public interface CarService {
    CarDto save(Car car);

    List<CarDto> findAll();

    void deleteByID(Integer id);
}
