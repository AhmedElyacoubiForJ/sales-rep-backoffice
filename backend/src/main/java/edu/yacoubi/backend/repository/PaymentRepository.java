package edu.yacoubi.backend.repository;

import edu.yacoubi.backend.model.Payment;
import edu.yacoubi.backend.model.PaymentId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, PaymentId> {
}
