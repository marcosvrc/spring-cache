package br.com.app.springcache;

import br.entity.Product;
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
			System.out.println(showProduct(productService, 1L));
			System.out.println(showProduct(productService, 2L));
			System.out.println(showProduct(productService, 1L));
			System.out.println(showProduct(productService, 1L));
			System.out.println(showProduct(productService, 1L));
			System.out.println(showProduct(productService, 2L));
			System.out.println(showProduct(productService, 3L));
			System.out.println(showProduct(productService, 4L));
			System.out.println(showProduct(productService, 5L));
			System.out.println(showProduct(productService, 3L));
		};
	}

	public String showProduct(ProductService productService, Long id) {

		long start = System.currentTimeMillis();
		Product product = productService.getById(id);
		long elapsed = System.currentTimeMillis() - start;

		StringBuilder sb = new StringBuilder();
		sb.append("Id: ").append(id);
		sb.append(" - Product Name: ").append(product.getName());
		sb.append(" - Product Description: ").append(product.getDescription());
		sb.append(" - Elapsed Time: ").append(elapsed).append("ms");

		return sb.toString();
	}
}
