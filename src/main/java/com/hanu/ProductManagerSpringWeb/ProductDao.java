package com.hanu.ProductManagerSpringWeb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

    List<Product> findByNameContainingIgnoreCase(String value);

    List<Product> findByPlaceContainingIgnoreCase(String value);

    List<Product> findByNameContainingIgnoreCaseOrTypeContainingIgnoreCaseOrPlaceContainingIgnoreCase(String value, String value1, String value2);

    List<Product> findByWarrantyLessThan(int i);
}
