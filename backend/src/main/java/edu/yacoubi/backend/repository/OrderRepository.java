package edu.yacoubi.backend.repository;

import edu.yacoubi.backend.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
