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
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Payment {
    @EmbeddedId
    private PaymentId id;

    @Temporal(TemporalType.DATE)
    private Date paymentDate;

    @DecimalMin("0.0")
    private BigDecimal amount;
}
