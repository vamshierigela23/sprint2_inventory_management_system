package com.capgemini.inventorymanagementsystem.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.inventorymanagementsystem.dto.ProductStock;

@Repository
public interface ProductStockDAO extends JpaRepository<ProductStock,Integer>
{

}
