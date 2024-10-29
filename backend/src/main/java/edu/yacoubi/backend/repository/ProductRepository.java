package edu.yacoubi.backend.repository;

import edu.yacoubi.backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
