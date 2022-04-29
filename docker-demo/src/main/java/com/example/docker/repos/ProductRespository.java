package com.example.docker.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.docker.entities.Products;

public interface ProductRespository extends JpaRepository<Products, Long> {

}
