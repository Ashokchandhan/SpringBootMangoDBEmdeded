package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.document.Product;
import com.app.repo.ProductRepository;
@Component
public class ConsolRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		
	repo.save(new Product("A", "10",2.2));
	repo.save(new Product("B", "11",3.2));
	repo.save(new Product("C", "12",4.2));
	
   System.out.println("-------------");
   repo.findAll().forEach(System.out::println);
		
		
	}

}
