package com.platform.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.platform.model.Product;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Integer> {


	@Query("SELECT name FROM Product where name like %:keyword%")
	public List<Product> searchProduct(@Param("keyword") String keyword );
}
