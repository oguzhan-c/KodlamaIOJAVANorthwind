package KodlamaIO.northwind.business.abstracts;

import java.util.List; 

import KodlamaIO.northwind.entites.concretes.Product;

public interface ProductService {
	
	List<Product> getAll();
	
}
