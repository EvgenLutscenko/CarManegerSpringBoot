package com.example.carsshopfactoriesmaneger.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.hibernate.annotations.WhereJoinTable;

@Data
@SQLDelete(sql = "UPDATE cars SET is_delete=true WHERE id=?")
@Where(clause = "is_delete=false")

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "is_delete", nullable = false)
    private boolean isDelete;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "factory_id")
    private Factory factory;
}
