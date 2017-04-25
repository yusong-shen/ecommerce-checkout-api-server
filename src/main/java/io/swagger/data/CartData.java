package io.swagger.data;

import java.util.ArrayList;
import java.util.List;

import io.swagger.model.Address;
import io.swagger.model.Cart;
import io.swagger.model.CustomerAttributes;
import io.swagger.model.Product;

public class CartData {

	
	static Cart createCart(Address billingAddress, Address shippingAddress, String domesticShippingCharge, 
			Integer shippingMethod, String merchantCurrency, Boolean chargeInsurance, List<Product> products, 
			CustomerAttributes customerAttributes) {
		Cart cart = new Cart();
		cart.setBillingAddress(billingAddress);
		cart.setShippingAddress(shippingAddress);
		cart.setDomesticShippingCharge(domesticShippingCharge);
		cart.setShippingMethod(shippingMethod);
		cart.setMerchantCurrency(merchantCurrency);
		cart.setChargeInsurance(chargeInsurance);
		cart.setProducts(products);
		cart.setCustomerAttributes(customerAttributes);
		
		return cart;
	}
	
}
