package com.unla.grupo03.service;

import java.util.List;

import com.unla.grupo03.model.Product;

public interface ProductService {
	
	
	public List<Product> listar();

	public void delete(int id);
}
