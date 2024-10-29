package edu.yacoubi.backend.repository;

import edu.yacoubi.backend.model.OrderDetail;
import edu.yacoubi.backend.model.OrderDetailId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailId> {
}
