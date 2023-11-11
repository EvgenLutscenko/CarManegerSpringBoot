package com.example.carsshopfactoriesmaneger.repository.specProviderMan;

import com.example.carsshopfactoriesmaneger.model.Car;
import com.example.carsshopfactoriesmaneger.repository.carSpec.SpecificationProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class CarSpecificationProviderManager implements SpecificationProviderManager<Car> {
    private final List<SpecificationProvider<Car>> specProvider;
    @Override
    public SpecificationProvider<Car> getSpecificationProvider(String key) {
        return specProvider.stream().filter(carSpecificationProvider -> carSpecificationProvider.getKey().equals(key))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Can't find specification provider by key: " + key));
    }
}
