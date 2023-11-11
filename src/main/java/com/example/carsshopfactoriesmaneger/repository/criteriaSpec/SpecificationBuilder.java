package com.example.carsshopfactoriesmaneger.repository.criteriaSpec;

import com.example.carsshopfactoriesmaneger.dto.carDto.CarSearchParametrs;
import org.springframework.data.jpa.domain.Specification;

public interface SpecificationBuilder<T> {
    Specification<T> build(CarSearchParametrs carSearchParametrs);
}
