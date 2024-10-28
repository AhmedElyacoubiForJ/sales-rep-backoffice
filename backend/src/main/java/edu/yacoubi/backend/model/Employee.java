package edu.yacoubi.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Employee {
    @Id
    @NotNull
    private int employeeNumber;

    private String lastName;

    private String firstName;

    private String extension;

    private String email;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "officeCode")
    private Office office;

    @ManyToOne
    @JoinColumn(name = "reportsTo")
    private Employee reportsTo;

    private String jobTitle;
}

