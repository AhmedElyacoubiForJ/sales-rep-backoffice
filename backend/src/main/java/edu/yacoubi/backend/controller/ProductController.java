package edu.yacoubi.backend.controller;

import edu.yacoubi.backend.dto.ProductRequestDTO;
import edu.yacoubi.backend.dto.ProductResponseDTO;
import edu.yacoubi.backend.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final IProductService productService;

    @Autowired
    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductResponseDTO> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{productCode}")
    public ResponseEntity<ProductResponseDTO> getProductById(@PathVariable String productCode) {
        return productService.getProductById(productCode)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ProductResponseDTO> createProduct(@RequestBody ProductRequestDTO productRequestDTO) {
        ProductResponseDTO savedProduct = productService.saveProduct(productRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
    }

    @PutMapping("/{productCode}")
    public ResponseEntity<ProductResponseDTO> updateProduct(@PathVariable String productCode, @RequestBody ProductRequestDTO productRequestDTO) {
        if (productService.getProductById(productCode).isPresent()) {
            //productRequestDTO.setProductCode(productCode); // ProductCode setzen
            ProductResponseDTO updatedProduct = productService.saveProduct(productRequestDTO);
            return ResponseEntity.ok(updatedProduct);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{productCode}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String productCode) {
        if (productService.getProductById(productCode).isPresent()) {
            productService.deleteProduct(productCode);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

