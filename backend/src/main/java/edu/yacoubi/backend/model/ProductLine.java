package edu.yacoubi.backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ProductLine {
    @Id
    @NotNull
    private String productLine;

    @Size(max = 255)
    private String textDescription;

    private String htmlDescription;

    private byte[] image;
}
