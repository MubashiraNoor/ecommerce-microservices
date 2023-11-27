package com.mubashiranoor.orderservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Entity

@Table(name = "order_line_items",schema = "e_com")
public class OrderLineItems {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
