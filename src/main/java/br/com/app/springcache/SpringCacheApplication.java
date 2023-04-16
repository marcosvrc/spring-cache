package br.com.app.springcache;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import br.service.ProductService;

@SpringBootApplication
@EnableCaching
public class SpringCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCacheApplication.class, args);
	}

	@Bean
	ProductService getProductService(){
		return new ProductService();
	}

	@Bean
	ApplicationRunner runner(ProductService productService){
		return args -> {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Id: 1 " + productService.getById(1L));
			System.out.println("Id: 2 " + productService.getById(2L));
			System.out.println("Id: 1 " + productService.getById(1L));
			System.out.println("Id: 1 " + productService.getById(1L));
			System.out.println("Id: 1 " + productService.getById(1L));
		};
	}
}
