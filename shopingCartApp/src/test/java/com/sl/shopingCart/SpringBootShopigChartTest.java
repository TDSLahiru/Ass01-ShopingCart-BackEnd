package com.sl.shopingCart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.sl.shopingCart.entity.Product;
import com.sl.shopingCart.repository.ProductsRepository;
import com.sl.shopingCart.response.ProductPriceDetailsResponse;
import com.sl.shopingCart.service.ShopingCartService;
import com.sl.shopingCart.serviceImpl.ShopingCartServiceImpl;


@SpringBootTest
public class SpringBootShopigChartTest {
	
	@InjectMocks
	ShopingCartService shopingCartService = new ShopingCartServiceImpl();

	@Mock
	ProductsRepository productsRepository;

	@Test
	void getAllProductsDetailsTest() throws Exception {
		Mockito.when(productsRepository.findAll())
				.thenReturn(Stream
						.of(new Product( 1L, "penguine Ears", 20,  175f,  0.3f,  0.1f,3),
								new Product(2L, "Horseshoe", 5, 825f, 0.3f,  0.1f,3))
						.collect(Collectors.toList()));
		assertEquals(2, shopingCartService.getAllProductsDetails().size());

	}

	@Test
	void getCartonPriceDetailsTest()throws Exception {
		int qty=5;
		Long id = 1L;
		 Product pobject = new Product(1L,"penguine Ears",20,175f,0.3f,0.1f,3);
		 Optional<Product> optionalProduct = Optional.of(pobject);
	        Mockito.when(productsRepository.findById(1L)).thenReturn(optionalProduct);
	        ProductPriceDetailsResponse productPriceDetailsResponse = shopingCartService.getCartonPriceDetails(qty, id);
			int units = qty % pobject.getCartonSize();
			assertEquals(units, productPriceDetailsResponse.getUnits());

	}

}
