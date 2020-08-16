package demo.rest.api.service;

import demo.rest.api.dto.ProductDto;
import demo.rest.api.entity.Product;

import java.util.List;

/**
 * @author Nguyen Danh Luong on 8/16/2020.
 * @created 16/08/2020
 * @project demo-rest-api
 */
public interface ProductService {

    List<ProductDto> getAll();

    ProductDto findById(Long id);

    List<ProductDto> findByName(String name);
}
