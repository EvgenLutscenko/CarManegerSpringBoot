package com.example.carsshopfactoriesmaneger.dto.carDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CarRequestDto {
    private Integer id;

    private String name;

    private Integer factoryId;
}
