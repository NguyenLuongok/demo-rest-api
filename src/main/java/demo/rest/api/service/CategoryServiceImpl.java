package demo.rest.api.service;

import demo.rest.api.dto.CategoryDto;
import demo.rest.api.entity.Category;
import demo.rest.api.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Nguyen Danh Luong on 8/16/2020.
 * @created 16/08/2020
 * @project demo-rest-api
 */
@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    protected CategoryRepository categoryRepository;

    @Override
    public List<CategoryDto> getAll() {
        return this.categoryRepository.findAll().stream().map(CategoryDto::fromEntity).collect(Collectors.toList());
    }
}
