package com.capgemini.inventorymanagementsystem.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.inventorymanagementsystem.dto.ProductStock;

@Repository
public interface ProductStockDAO extends JpaRepository<ProductStock,Integer>
{
@Query("select product from ProductStock product where orderid=?1")
public ProductStock getProductDetail(int orderid);
}
