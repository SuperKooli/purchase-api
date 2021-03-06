package com.purchase.sevice;

import java.util.List;

import com.purchase.entity.Supplier;
public interface SupplierService {

	public List<Supplier> getAllSupplier();
	
	Supplier getSupplierById(String supplierId);
	
	boolean addSupplier(Supplier supplier);
	
	boolean deleteSupplierById(String supplierId);
	
	boolean updateSupplier(Supplier supplier);
	
}
