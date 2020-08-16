package demo.rest.api.controller;

import demo.rest.api.dto.CategoryDto;
import demo.rest.api.entity.Category;
import demo.rest.api.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Nguyen Danh Luong on 8/16/2020.
 * @created 16/08/2020
 * @project demo-rest-api
 */
@Controller
@RequestMapping("/webapi/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @ResponseBody
    @GetMapping
    public ResponseEntity<List<CategoryDto>> getAll() {
        return new ResponseEntity(this.categoryService.getAll(), HttpStatus.OK);
    }
}
