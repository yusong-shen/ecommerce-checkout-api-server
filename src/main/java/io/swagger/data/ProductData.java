package io.swagger.data;

import io.swagger.model.Product;

public class ProductData {

	public static Product createProduct(String custom1, String custom2, String custom3, String id, String name, String price, Integer quantity, String shipping) {
		Product product = new Product();
		product.setCustom1(custom1);
		product.setCustom2(custom2);
		product.setCustom3(custom3);
		product.setId(id);
		product.setName(name);
		product.setPrice(price);
		product.setQuantity(quantity);
		product.setShipping(shipping);
		
		return product;
	}
}
