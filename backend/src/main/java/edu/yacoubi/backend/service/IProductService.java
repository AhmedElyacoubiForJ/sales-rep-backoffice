package edu.yacoubi.backend.service;

import edu.yacoubi.backend.dto.ProductRequestDTO;
import edu.yacoubi.backend.dto.ProductResponseDTO;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<ProductResponseDTO> getAllProducts();

    Optional<ProductResponseDTO> getProductById(String productCode);

    ProductResponseDTO saveProduct(ProductRequestDTO productRequestDTO);

    void deleteProduct(String productCode);
}
