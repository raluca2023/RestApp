package com.example.RestApp.service;

import com.example.RestApp.entity.Laptop;
import com.example.RestApp.mapper.LaptopMapper;
import com.example.RestApp.model.LaptopModel;
import com.example.RestApp.repository.LaptopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LaptopService {
    private final LaptopRepository laptopRepository;


    public Laptop save(LaptopModel laptopModel) {
        Laptop laptop = LaptopMapper.modelToEntity(laptopModel);
        return laptopRepository.save(laptop);
    }


    public List<LaptopModel> getAllLaptops() {
       return laptopRepository.findByOrderById().stream()
                .map(LaptopMapper::entityToModel)
                .collect(Collectors.toList());
    }

    public List<LaptopModel> deleteById(Long id) {
       laptopRepository.deleteById(id);
       return getAllLaptops();
    }

    public List<LaptopModel> editLaptop(LaptopModel laptopModel) {
        save(laptopModel);
        return getAllLaptops();

    }

    public LaptopModel getHighestId() {
        return LaptopMapper.entityToModel(laptopRepository.findTop1ByOrderByIdDesc());
    }

    public LaptopModel getLaptopById(Long id) {
        return laptopRepository.findById(id)
                .map(LaptopMapper::entityToModel)
                .orElse(null);
    }
}
