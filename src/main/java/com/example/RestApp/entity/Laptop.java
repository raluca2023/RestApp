package com.example.RestApp.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_laptop_generator")
    @SequenceGenerator(name = "seq_laptop_generator", sequenceName = "seq_laptop", allocationSize = 1, initialValue = 1)
    @Column(name = "id")
    private Long id;
    @Column(name = "type")
    private String laptopType;
    @Column(name = "color")
    private String laptopColor;
    @Column(name = "price")
    private Integer laptopPrice;
}
