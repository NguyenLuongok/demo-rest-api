package demo.rest.api.dto;

import demo.rest.api.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Nguyen Danh Luong on 8/16/2020.
 * @created 16/08/2020
 * @project demo-rest-api
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {

    private Long id;
    private String nameProduct;
    private Double price;
    private String information;
    private Long categoryId;

    // get product dto to entity
    public static ProductDto fromEntity(Product entity){
        return ProductDto.builder()
                .id(entity.getId())
                .nameProduct(entity.getName())
                .price(entity.getPrice())
                .information(entity.getInformation())
                .categoryId(entity.getCategoryId()).build();
    }

    // get entity to dto
    public Product toEntity(){
        Product product = Product.builder()
                .id(this.getId())
                .name(this.getNameProduct())
                .price(this.getPrice())
                .categoryId(this.getCategoryId()).build();
        return product;
    }
}
