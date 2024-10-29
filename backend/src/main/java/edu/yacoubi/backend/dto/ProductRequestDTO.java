package edu.yacoubi.backend.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductRequestDTO {
    private String productName;
    private String productLine;
    private String productScale;
    private String productVendor;
    private String productDescription;
    private int quantityInStock;
    private BigDecimal buyPrice;
    private BigDecimal MSRP;
}
