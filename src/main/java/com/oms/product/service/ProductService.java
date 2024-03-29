package com.oms.product.service;

import java.util.List;

import com.oms.product.dto.ProductDTO;
import com.oms.product.exception.ProductMsException;

public interface ProductService {
	
	public String addProduct(ProductDTO productDTO) throws ProductMsException;
	
	public String deleteProduct(String id) throws ProductMsException;
	
	public ProductDTO getProductByName(String name) throws ProductMsException;
	
	public List<ProductDTO> getProductByCategory(String category) throws ProductMsException;
	
	public ProductDTO getProductById(String id) throws ProductMsException;
	
	public List<ProductDTO> viewAllProducts() throws ProductMsException;
	
	public Boolean updateStockOfProdDelete(String prodId, Integer quantity) throws ProductMsException;
	
	public Boolean updateStockOfProdAdd(String prodId, Integer quantity) throws ProductMsException;
	
	public String subscribeProduct(String buyerId, String prodId, Integer quantity) throws ProductMsException;

}
