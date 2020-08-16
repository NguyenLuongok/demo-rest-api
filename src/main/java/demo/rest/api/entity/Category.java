package demo.rest.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * @author Nguyen Danh Luong on 8/16/2020.
 * @created 16/08/2020
 * @project demo-rest-api
 */
@Table(name = "of_category")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    private static final long serialVersionUID = -4920952171732850708L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

}
