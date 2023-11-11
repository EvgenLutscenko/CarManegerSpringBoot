package com.example.carsshopfactoriesmaneger.repository.criteriaSpec;

import com.example.carsshopfactoriesmaneger.dto.carDto.CarSearchParametrs;
import com.example.carsshopfactoriesmaneger.model.Car;
import com.example.carsshopfactoriesmaneger.repository.specProviderMan.SpecificationProviderManager;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CarSpecificationBuilder implements SpecificationBuilder<Car> {
    private final SpecificationProviderManager<Car> specificationProviderManager;

    @Override
    public Specification<Car> build(CarSearchParametrs carSearchParametrs) {
        Specification<Car> spec = Specification.where(null);

        if(carSearchParametrs.getModels() != null && carSearchParametrs.getModels().length > 0){
            spec = spec.and(specificationProviderManager.getSpecificationProvider("model").getSpecification(carSearchParametrs.getModels()));
        }

        if(carSearchParametrs.getColors() != null && carSearchParametrs.getColors().length > 0){
            spec = spec.and(specificationProviderManager.getSpecificationProvider("color").getSpecification(carSearchParametrs.getColors()));
        }

        return spec;
    }
}
