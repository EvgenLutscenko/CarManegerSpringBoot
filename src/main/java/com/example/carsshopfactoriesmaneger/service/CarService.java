package com.example.carsshopfactoriesmaneger.service;


import com.example.carsshopfactoriesmaneger.dto.carDto.CarDto;
import com.example.carsshopfactoriesmaneger.dto.carDto.CarRequestDto;
import com.example.carsshopfactoriesmaneger.dto.carDto.CarSearchParametrs;
import com.example.carsshopfactoriesmaneger.model.Car;

import java.util.List;

public interface CarService {
    CarDto save(CarRequestDto car);

    List<CarDto> findAll(CarSearchParametrs carSearchParametrs);

    List<CarDto> findAll();

    void deleteByID(Integer id);
}
