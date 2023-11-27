package com.mubashiranoor.inventoryservice.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "inventory", schema = "e_com")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private int quantity;

}
