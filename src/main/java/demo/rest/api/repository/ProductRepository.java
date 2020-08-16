package demo.rest.api.repository;

import demo.rest.api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Nguyen Danh Luong on 8/16/2020.
 * @created 16/08/2020
 * @project demo-rest-api
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByName(String name);
}
