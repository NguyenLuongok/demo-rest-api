package demo.rest.api.repository;

import demo.rest.api.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Nguyen Danh Luong on 8/16/2020.
 * @created 16/08/2020
 * @project demo-rest-api
 */
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
