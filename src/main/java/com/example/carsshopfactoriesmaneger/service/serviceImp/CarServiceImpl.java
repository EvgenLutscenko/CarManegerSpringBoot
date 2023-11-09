package com.example.carsshopfactoriesmaneger.service.serviceImp;

import com.example.carsshopfactoriesmaneger.dto.carDto.CarDto;
import com.example.carsshopfactoriesmaneger.dto.carDto.CarRequestDto;
import com.example.carsshopfactoriesmaneger.mapper.CarMapper;
import com.example.carsshopfactoriesmaneger.model.Car;
import com.example.carsshopfactoriesmaneger.repository.CarRepository;
import com.example.carsshopfactoriesmaneger.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;
    private final CarMapper carMapper;
    @Override
    public CarDto save(CarRequestDto car) {
        Car model = carMapper.toModel(car);
        return carMapper.toDto(carRepository.save(model));
    }

    @Override
    public List<CarDto> findAll() {
        List<CarDto> all = carRepository.findAll().stream()
                .map(carMapper::toDto)
                .toList();

        return all;
    }

    @Override
    public void deleteByID(Integer id) {
        carRepository.deleteById(id);
    }
}
