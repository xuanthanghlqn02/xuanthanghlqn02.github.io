package com.example.computer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_configuration")
public class ProductConfiguration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name="cpu",nullable = false)
    private String cpu;

    @Column(name="ram",nullable = false)
    private String ram;

    @Column(name="hard_disk",nullable = false)
    private String hardDisk;

    @Column(name="gpu",nullable = false)
    private String gpu;

    @Column(name="monitor")
    private String monitor;

    @Column(name="os")
    private String os;

    @Column(name="brand_name")
    private String brandName;

    @Column(name="connection_standard")
    private String connectionStandard;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "product_id")
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}