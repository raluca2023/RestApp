package com.example.RestApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LaptopModel {

    private Long id;
    private String laptopType;
    private String laptopColor;
    private Integer laptopPrice;


}
