package com.example.computer.service;

import com.example.computer.dto.ProductDto;
import com.example.computer.dto.ProductDtoTest;
import com.example.computer.entity.Product;
import com.example.computer.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<ProductDto> findAll() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(product -> modelMapper.map(product, ProductDto.class))
                .sorted((a, b) -> b.getCreated_at().compareTo(a.getCreated_at()))
                .collect(Collectors.toList());
    }

    public ProductDto getProductById(Integer id) {
        Product product = productRepository.getProductById(id);
        return modelMapper.map(product, ProductDto.class);
    }
}
