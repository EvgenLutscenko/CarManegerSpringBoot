package com.example.carsshopfactoriesmaneger.dto.carDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CarRequestDto {
    private String brand;

    private String model;

    private String color;

    private Integer factoryId;
}
