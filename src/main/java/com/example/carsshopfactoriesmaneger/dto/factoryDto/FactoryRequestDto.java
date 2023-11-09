package com.example.carsshopfactoriesmaneger.dto.factoryDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FactoryRequestDto {
    private String name;

    private String location;
}
