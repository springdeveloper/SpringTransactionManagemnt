package com.app.navneet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.app.navneet.model.Book;
import com.app.navneet.service.BookService;

@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
public class SpringTransactionManagemntApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringTransactionManagemntApplication.class, args);
	}

	
	@Autowired
	BookService bookservie;
	
	@Override
	public void run(String... args) throws Exception {

		Book b=new Book();
		b.setAutherName("Navneet Dubey");
		b.setBookName("Java");
		b.setPrice(120);
		bookservie.addBook(b);
		
	}

}
