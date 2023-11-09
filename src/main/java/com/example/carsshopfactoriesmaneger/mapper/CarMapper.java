package com.example.carsshopfactoriesmaneger.mapper;

import com.example.carsshopfactoriesmaneger.config.MapperConfig;
import com.example.carsshopfactoriesmaneger.dto.carDto.CarDto;
import com.example.carsshopfactoriesmaneger.dto.carDto.CarRequestDto;
import com.example.carsshopfactoriesmaneger.model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = MapperConfig.class, uses = FactoryMapper.class)
public interface CarMapper {
    @Mapping(target = "factoryId", source = "factory.id")
    CarDto toDto(Car car);
    @Mapping(target = "factory", source = "factoryId", qualifiedByName = "factoryById")
    Car toModel(CarRequestDto carRequestDto);
}
