package KodlamaIO.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import KodlamaIO.northwind.entites.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	
}
