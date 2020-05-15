package com.capgemini.inventorymanagementsystem.dto;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="rawmaterialstock")
public class RawMaterialStock {
	 @Id	
	   @Column(name="orderid")
	   int orderId;
	 @Column(name="name")
	 String Name;
	 @Column(name="price_per_unit")
	 double pricePerUnit;
	 @Column(name="quantityvalue")
	 int quantityValue;
	 @Column(name="quantityunit")
	 int quantityUnit;
	 @Column(name="price")
	 double price;
	 @Column(name="warehouseid")
	 String warehouseId;
	 @Column(name="deliverydate")
	 @Temporal(value=TemporalType.TIMESTAMP)
	 Date deliveryDate;
	 @Column(name="manufacturingdate")
	 @Temporal(value=TemporalType.TIMESTAMP)
	 Date manufacturingDate;
	 @Column(name="expirydate")
	 @Temporal(value=TemporalType.TIMESTAMP)
	 Date expiryDate;
	 @Column(name="qualitycheck")
	 String qualityCheck;
	 @Column(name="processdate")
	 @Temporal(value=TemporalType.TIMESTAMP)
	 Date processDate;
	 public RawMaterialStock() {}
	public RawMaterialStock(int orderId, String name, double pricePerUnit,int quantityValue, int quantityUnit,
			double price, String warehouseId, Date deliveryDate, Date manufacturingDate, Date expiryDate,
			String qualityCheck, Date processDate) {
		super();
		this.orderId = orderId;
		this.Name = name;
		this.quantityValue = quantityValue;
		this.pricePerUnit = pricePerUnit;
		this.quantityUnit = quantityUnit;
		this.price = price;
		this.warehouseId = warehouseId;
		this.deliveryDate = deliveryDate;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
		this.qualityCheck = qualityCheck;
		this.processDate = processDate;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getQuantityValue() {
		return quantityValue;
	}
	public void setQuantityValue(int quantityValue) {
		this.quantityValue = quantityValue;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public int getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(int quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Date getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getQualityCheck() {
		return qualityCheck;
	}
	public void setQualityCheck(String qualityCheck) {
		this.qualityCheck = qualityCheck;
	}
	public Date getProcessDate() {
		return processDate;
	}
	public void setProcessDate(Date processDate) {
		this.processDate =processDate;
	}


}
