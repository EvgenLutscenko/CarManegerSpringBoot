package com.example.carsshopfactoriesmaneger.mapper;

import com.example.carsshopfactoriesmaneger.config.MapperConfig;
import com.example.carsshopfactoriesmaneger.dto.carDto.FactoryDtoForCar;
import com.example.carsshopfactoriesmaneger.model.Factory;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface FactoryMapper {
    FactoryDtoForCar toDto(Factory factory);
}
