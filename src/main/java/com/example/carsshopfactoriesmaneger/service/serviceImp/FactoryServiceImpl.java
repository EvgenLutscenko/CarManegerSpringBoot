package com.example.carsshopfactoriesmaneger.service.serviceImp;

import com.example.carsshopfactoriesmaneger.dto.factoryDto.FactoryDto;
import com.example.carsshopfactoriesmaneger.dto.factoryDto.FactoryRequestDto;
import com.example.carsshopfactoriesmaneger.mapper.FactoryMapper;
import com.example.carsshopfactoriesmaneger.model.Car;
import com.example.carsshopfactoriesmaneger.model.Factory;
import com.example.carsshopfactoriesmaneger.repository.CarRepository;
import com.example.carsshopfactoriesmaneger.repository.FactoryRepository;
import com.example.carsshopfactoriesmaneger.service.FactoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FactoryServiceImpl implements FactoryService {
    private final FactoryRepository factoryRepository;
    private final FactoryMapper factoryMapper;
    @Override
    public FactoryDto save(FactoryRequestDto factory) {
        Factory model = factoryMapper.toModel(factory);
        return factoryMapper.toDto(factoryRepository.save(model));
    }

    @Override
    public List<Factory> findAll() {
        return factoryRepository.findAll();
    }

    @Override
    public void deleteByID(Integer id) {
        factoryRepository.deleteById(id);
    }
}
