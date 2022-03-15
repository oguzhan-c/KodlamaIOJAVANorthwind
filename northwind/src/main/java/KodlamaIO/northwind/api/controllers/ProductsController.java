package KodlamaIO.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import KodlamaIO.northwind.business.abstracts.ProductService;
import KodlamaIO.northwind.entites.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController  {
	
	private ProductService productService;
	
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public List<Product> getAll(){
		return productService.getAll();
	}
}
