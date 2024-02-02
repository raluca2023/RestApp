package com.example.RestApp.repository;

import com.example.RestApp.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {

    List<Laptop> findByOrderById();

    Laptop findTop1ByOrderByIdDesc();
}
