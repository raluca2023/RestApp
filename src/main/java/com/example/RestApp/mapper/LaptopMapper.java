package com.example.RestApp.mapper;

import com.example.RestApp.entity.Laptop;
import com.example.RestApp.model.LaptopModel;

public class LaptopMapper {

    public static Laptop modelToEntity(LaptopModel laptopModel) {
        Laptop laptop = new Laptop();
        laptop.setId(laptopModel.getId());
        laptop.setLaptopType(laptopModel.getLaptopType());
        laptop.setLaptopColor(laptopModel.getLaptopColor());
        laptop.setLaptopPrice(laptopModel.getLaptopPrice());
        return laptop;
    }

    public static LaptopModel entityToModel(Laptop laptop) {
        LaptopModel laptopModel = new LaptopModel();
        laptopModel.setId(laptop.getId());
        laptopModel.setLaptopType(laptop.getLaptopType());
        laptopModel.setLaptopColor(laptop.getLaptopColor());
        laptopModel.setLaptopPrice(laptop.getLaptopPrice());
        return laptopModel;
    }
}
