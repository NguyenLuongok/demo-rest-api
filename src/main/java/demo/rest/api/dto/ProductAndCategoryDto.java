package demo.rest.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Nguyen Danh Luong on 8/16/2020.
 * @created 16/08/2020
 * @project demo-rest-api
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductAndCategoryDto{
    private List<CategoryDto> categoryDto;
    private List<ProductDto> productDto;

    public static  ProductAndCategoryDto fromEntity(List<CategoryDto> categoryDto, List<ProductDto> productDto){
        return ProductAndCategoryDto.builder()
                .categoryDto(categoryDto)
                .productDto(productDto).build();
    }
}

