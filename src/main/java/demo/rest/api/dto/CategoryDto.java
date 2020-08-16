package demo.rest.api.dto;

import demo.rest.api.entity.Category;
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
public class CategoryDto {

    private Long id;

    private String name;

    public static CategoryDto fromEntity(Category entity){
        return CategoryDto.builder()
                .id(entity.getId())
                .name(entity.getName()).build();
    }

    public Category toEntity(){
        Category category = Category.builder()
                .id(this.getId())
                .name(this.getName()).build();
        return category;
    }
}
