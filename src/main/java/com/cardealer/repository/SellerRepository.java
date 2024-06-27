package com.cardealer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cardealer.model.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

    @Query(value = "select * from seller where email =?1", nativeQuery = true)
    public Seller findByEmail(String email);
    
}
