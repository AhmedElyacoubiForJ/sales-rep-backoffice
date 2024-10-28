package edu.yacoubi.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Product {
    @Id
    @NotNull
    private String productCode;

    @NotNull
    private String productName;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "productLine")
    private ProductLine productLine;

    private String productScale;

    private String productVendor;

    private String productDescription;

    @Min(0)
    private int quantityInStock;

    @DecimalMin("0.0")
    private BigDecimal buyPrice;

    @DecimalMin("0.0")
    private BigDecimal MSRP;
}
