package com.capgemini.inventorymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inventorymanagementsystem.dto.RawMaterialStock;
import com.capgemini.inventorymanagementsystem.dto.RawMaterialStock;
import com.capgemini.inventorymanagementsystem.service.RawMaterialStockService;

import brave.sampler.Sampler;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RawMaterialStockController {
 

		@Autowired
		RawMaterialStockService rawMaterialStockService;
		public void setRawMaterialStockService(RawMaterialStockService rawMaterialStockService)
		{
			this.rawMaterialStockService=rawMaterialStockService;
		}
		@Bean
		public Sampler defaultSampler() {
			return Sampler.ALWAYS_SAMPLE;
		}
	  
		@PutMapping("/rawmaterialstock/exitdate")
		public ResponseEntity<String> UpdateRawMaterialStock(@RequestBody RawMaterialStock rawmaterialstock) {
			RawMaterialStock t = rawMaterialStockService.updateRawMaterialStock(rawmaterialstock);
			if (t == null) {
				
				return new ResponseEntity<String>("Update Operation Unsuccessful,Provided testId does not exist", new HttpHeaders(), HttpStatus.OK);
			
			} else {
				return new ResponseEntity<String>("Updated successfully", new HttpHeaders(), HttpStatus.OK);
			}
		
		
	   }
	  
	}


