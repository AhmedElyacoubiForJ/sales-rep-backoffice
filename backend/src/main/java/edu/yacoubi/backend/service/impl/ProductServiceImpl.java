package edu.yacoubi.backend.service.impl;

import edu.yacoubi.backend.dto.ProductRequestDTO;
import edu.yacoubi.backend.dto.ProductResponseDTO;
import edu.yacoubi.backend.model.Product;
import edu.yacoubi.backend.repository.ProductRepository;
import edu.yacoubi.backend.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {

    private final ProductRepository productRepository;

    @Override
    public List<ProductResponseDTO> getAllProducts() {
        return productRepository.findAll().stream()
                .map(this::convertToResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ProductResponseDTO> getProductById(String productCode) {
        return productRepository.findById(productCode)
                .map(this::convertToResponseDTO);
    }

    @Override
    public ProductResponseDTO saveProduct(ProductRequestDTO productRequestDTO) {
        Product product = convertToEntity(productRequestDTO);
        product = productRepository.save(product);
        return convertToResponseDTO(product);
    }

    @Override
    public void deleteProduct(String productCode) {
        productRepository.deleteById(productCode);
    }

    private ProductResponseDTO convertToResponseDTO(Product product) {
        ProductResponseDTO responseDTO = new ProductResponseDTO();
        responseDTO.setProductCode(product.getProductCode());
        responseDTO.setProductName(product.getProductName());
        responseDTO.setProductLine(product.getProductCode());
        responseDTO.setProductVendor(product.getProductVendor());
        responseDTO.setMSRP(product.getMSRP());
        return responseDTO;
    }

    private Product convertToEntity(ProductRequestDTO productRequestDTO) {
        Product product = new Product();
        product.setProductName(productRequestDTO.getProductName());
        //product.setProductLine(productRequestDTO.getProductLine());
        product.setProductScale(productRequestDTO.getProductScale());
        product.setProductVendor(productRequestDTO.getProductVendor());
        product.setProductDescription(productRequestDTO.getProductDescription());
        product.setQuantityInStock(productRequestDTO.getQuantityInStock());
        product.setBuyPrice(productRequestDTO.getBuyPrice());
        product.setMSRP(productRequestDTO.getMSRP());
        return product;
    }
}
