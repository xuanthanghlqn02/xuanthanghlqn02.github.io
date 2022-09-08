package com.example.computer.dto;

import com.example.computer.entity.Category;
import com.example.computer.entity.ProductConfiguration;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDtoTest {
    private int id;
    private String name;
    private String code;
    private int price;
    private String image;
    private int quantity;
    private Boolean status;
    private Date created_at;
    private List<Category> categories = new ArrayList<>();
    private ProductConfiguration productConfiguration;
}
