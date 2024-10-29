package edu.yacoubi.backend.repository;

import edu.yacoubi.backend.model.ProductLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductLineRepository extends JpaRepository<ProductLine, String> {
}
