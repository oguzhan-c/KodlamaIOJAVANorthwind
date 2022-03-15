package KodlamaIO.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KodlamaIO.northwind.business.abstracts.ProductService;
import KodlamaIO.northwind.dataAccess.abstracts.ProductDao;
import KodlamaIO.northwind.entites.concretes.Product;
@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		
		return productDao.findAll();	
	}

}
