package com.example.carsshopfactoriesmaneger.dto.carDto;

import lombok.Data;

@Data
public class CarDto {

    private Integer id;

    private String name;

    private FactoryDtoForCar factory;
}
