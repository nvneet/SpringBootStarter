package com.navneet.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navneet.springweb.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
