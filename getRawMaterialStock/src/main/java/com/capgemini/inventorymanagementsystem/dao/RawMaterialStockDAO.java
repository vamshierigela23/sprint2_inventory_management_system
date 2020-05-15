package com.capgemini.inventorymanagementsystem.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.inventorymanagementsystem.dto.RawMaterialStock;
@Repository
public interface RawMaterialStockDAO extends JpaRepository<RawMaterialStock,Integer>
{
@Query("select raw from RawMaterialStock raw where orderid=?1")
public RawMaterialStock getRawDetails(int orderid);
}
