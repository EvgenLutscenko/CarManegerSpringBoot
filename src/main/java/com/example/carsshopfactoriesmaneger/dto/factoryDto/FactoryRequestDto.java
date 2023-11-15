package com.example.carsshopfactoriesmaneger.dto.factoryDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FactoryRequestDto {
    @NotNull
    private String name;

    @NotNull
    private String location;
}
