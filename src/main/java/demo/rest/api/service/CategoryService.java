package demo.rest.api.service;

import demo.rest.api.dto.CategoryDto;
import demo.rest.api.entity.Category;

import java.util.List;

/**
 * @author Nguyen Danh Luong on 8/16/2020.
 * @created 16/08/2020
 * @project demo-rest-api
 */
public interface CategoryService {

    List<CategoryDto> getAll();
}
