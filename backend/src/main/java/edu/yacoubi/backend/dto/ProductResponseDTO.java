package edu.yacoubi.backend.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductResponseDTO {
    private String productCode;
    private String productName;
    private String productLine;
    private String productVendor;
    private BigDecimal MSRP;
}
