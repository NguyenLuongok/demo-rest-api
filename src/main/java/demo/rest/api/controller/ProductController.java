package demo.rest.api.controller;

import demo.rest.api.dto.ProductAndCategoryDto;
import demo.rest.api.dto.ProductDto;
import demo.rest.api.entity.Product;
import demo.rest.api.service.CategoryService;
import demo.rest.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Nguyen Danh Luong on 8/16/2020.
 * @created 16/08/2020
 * @project demo-rest-api
 */
@RestController
@RequestMapping("/webapi/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<ProductDto>> getAll(){
        return new ResponseEntity<List<ProductDto>>(this.productService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> findById(@PathVariable Long id){
        return new ResponseEntity<ProductDto>(this.productService.findById(id),HttpStatus.OK);
    }

    @GetMapping("/get-all-product-and-category")
    public ResponseEntity<ProductAndCategoryDto> getAllProductAndCategory(){
      return new ResponseEntity<ProductAndCategoryDto>(ProductAndCategoryDto.fromEntity(this.categoryService.getAll()
            , this.productService.getAll()),HttpStatus.OK);
    }

    @GetMapping("/find-by-name/{name}")
    public ResponseEntity<List<ProductDto>> getAllByName(@PathVariable String name){
        return new ResponseEntity(this.productService.findByName(name),HttpStatus.OK);
    }
}
