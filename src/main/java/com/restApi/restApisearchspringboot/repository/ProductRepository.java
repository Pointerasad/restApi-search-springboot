package com.restApi.restApisearchspringboot.repository;

import com.restApi.restApisearchspringboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query("select p from Product p where p.name like concat('%',:query,'%') Or p.description like concat('%',:query,'%')")
    List<Product> searchProducts(@Param("query") String query);
}
