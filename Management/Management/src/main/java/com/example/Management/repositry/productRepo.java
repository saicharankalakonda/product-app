package com.example.Management.repositry;

import com.example.Management.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface productRepo extends JpaRepository<Product, BigInteger> {
}
