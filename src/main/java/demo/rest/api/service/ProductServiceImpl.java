package demo.rest.api.service;

import demo.rest.api.dto.ProductDto;
import demo.rest.api.entity.Product;
import demo.rest.api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Nguyen Danh Luong on 8/16/2020.
 * @created 16/08/2020
 * @project demo-rest-api
 */
@Service
public class ProductServiceImpl implements ProductService{


    @Autowired
    protected ProductRepository productRepository;

    @Override
    public List<ProductDto> getAll() {
        return this.productRepository.findAll().stream().map(ProductDto::fromEntity).collect(Collectors.toList());
    }

    @Override
    public ProductDto findById(Long id) {
        Optional<Product> product = this.productRepository.findById(id);
        return ProductDto.fromEntity(product.get());
    }

    @Override
    public List<ProductDto> findByName(String name) {
        return this.productRepository.findAllByName(name).stream().map(ProductDto::fromEntity).collect(Collectors.toList());
    }
}
