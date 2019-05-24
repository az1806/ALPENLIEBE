package com.dao;

import java.util.List;

import com.entity.Product;
import com.entity.Type;



public interface ProductDao {

	List<Product> queryProduct(int type);

	List<Type> queryType();
	
}
