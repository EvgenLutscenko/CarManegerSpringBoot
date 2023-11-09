package com.example.carsshopfactoriesmaneger.repository;


import com.example.carsshopfactoriesmaneger.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {
    @Query("from Car c right join fetch Factory f " +
            "where c.factory.id = f.id")
    List<Car> findAllCars();
}
