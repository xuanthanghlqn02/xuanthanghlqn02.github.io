package com.example.computer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDto implements Serializable {
    private int id;
    private String name;
    private String code;
    private int price;
    private String description;
    private String image;
    private boolean status;
    private List<CategoryDto> categories = new ArrayList<>();
    private Date created_at;
    private ProductConfigurationDto productConfiguration;

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class CategoryDto implements Serializable {
        private Integer id;
        private String name;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class ProductConfigurationDto implements Serializable {
        private Integer id;
        private String cpu;
        private String ram;
        private String hardDisk;
        private String gpu;
        private String monitor;
        private String os;
        private String brandName;
        private String connectionStandard;
    }
}
