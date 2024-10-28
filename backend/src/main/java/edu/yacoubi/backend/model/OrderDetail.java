package edu.yacoubi.backend.model;

import jakarta.persistence.*;
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
public class OrderDetail {
    @EmbeddedId
    private OrderDetailId id;

    @Min(1)
    private int quantityOrdered;

    @DecimalMin("0.0")
    private BigDecimal priceEach;

    private int orderLineNumber;
}
