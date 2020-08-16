package demo.rest.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

import javax.persistence.*;

/**
 * @author Nguyen Danh Luong on 8/16/2020.
 * @created 16/08/2020
 * @project demo-rest-api
 */

@Table(name = "of_product")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldNameConstants
public class Product {

    private static final long serialVersionUID = -713055888443040132L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Double price;
    private String information;

    @Column(name = "category_id",nullable = false)
    private Long categoryId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id",referencedColumnName = "id",insertable = false,updatable = false)
    private Category category;

}
