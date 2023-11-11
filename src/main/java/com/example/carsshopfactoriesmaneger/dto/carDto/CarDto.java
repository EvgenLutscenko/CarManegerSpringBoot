package com.example.carsshopfactoriesmaneger.dto.carDto;

import lombok.Data;

@Data
public class CarDto {

    private Integer id;

    private String brand;

    private String model;

    private String color;

    private Integer factoryId;
}
