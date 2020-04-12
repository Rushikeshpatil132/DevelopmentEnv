package com.platform.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.platform.model.Product;

@Service
public interface ProductService {

	public List<Product> search(String keyword);
}
