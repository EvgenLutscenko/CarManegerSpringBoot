package com.example.carsshopfactoriesmaneger.dto.carDto;

import lombok.Data;

@Data
public class CarRequestDto {
    private Integer id;

    private String name;

    private Integer factoryId;
}
