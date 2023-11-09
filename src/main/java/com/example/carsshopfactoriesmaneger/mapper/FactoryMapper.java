package com.example.carsshopfactoriesmaneger.mapper;

import com.example.carsshopfactoriesmaneger.config.MapperConfig;
import com.example.carsshopfactoriesmaneger.dto.factoryDto.FactoryDto;
import com.example.carsshopfactoriesmaneger.dto.factoryDto.FactoryRequestDto;
import com.example.carsshopfactoriesmaneger.model.Factory;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.Optional;

@Mapper(config = MapperConfig.class)
public interface FactoryMapper {

    Factory toModel(FactoryRequestDto factoryRequestDto);
    FactoryDto toDto(Factory factory);
    @Named("factoryById")
    default Factory factoryById(Integer id){
        return Optional.ofNullable(id)
                .map(Factory::new)
                .orElse(null);
    }
}
