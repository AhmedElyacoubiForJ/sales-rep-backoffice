package edu.yacoubi.backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class OrderDetailId implements Serializable {
    @NotNull
    private int orderNumber;

    @NotNull
    private String productCode;
}