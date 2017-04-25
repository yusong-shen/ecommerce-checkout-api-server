package io.swagger.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import io.swagger.model.AvailablePaymentMethod;
import io.swagger.model.AvailableShippingMethod;
import io.swagger.model.Cart;
import io.swagger.model.Checkout;
import io.swagger.model.CheckoutTotals;
import io.swagger.model.Product;

public class CheckoutData {

	static List<Checkout> checkouts = new ArrayList<>();
	
	static {
		Cart cart = CartData.createCart(null, null, null, null, null, null, new ArrayList<Product>(), null);
		checkouts.add(createCheckout("1", cart,  new ArrayList<AvailableShippingMethod>(),  new ArrayList<AvailablePaymentMethod>(), null, null));
	}

	public static Checkout createCheckout(String checkoutId, Cart cart, List<AvailableShippingMethod> availableShippingMethods,
			List<AvailablePaymentMethod> availablePaymentMethods, CheckoutTotals totals, CheckoutTotals merchantTotals) {
		Checkout checkout = new Checkout();
		checkout.setCheckoutId(checkoutId);
		checkout.setCart(cart);
		checkout.setAvailablePaymentMethods(availablePaymentMethods);
		checkout.setAvailableShippingMethods(availableShippingMethods);
		checkout.setTotals(totals);
		checkout.setMerchantTotals(merchantTotals);
		return checkout;
	}
	
	public static Checkout getById(String id) {
		for (Checkout checkout : checkouts) {
			if (checkout.getCheckoutId().equals(id)) {
				return checkout;
			}
		}
		return null;
	}
	
	public static boolean addCheckout(Checkout checkout) {
		if (checkout == null) return false;
		return checkouts.add(checkout);
	}
	
	public static Product getItemById(String id, String itemId) {
		for (Checkout checkout : checkouts) {
			if (!checkout.getCheckoutId().equals(id)) continue;
			if (checkout.getCart() == null || checkout.getCart().getProducts() == null) continue;
			List<Product> items = checkout.getCart().getProducts();
			for (Product p : items) {
				if (p.getId().equals(itemId)) {
					return p;
				}
			}
		}
		return null;
	}
	
	public static Product updateItemById(String id, String itemId, Product item) {
		for (Checkout checkout : checkouts) {
			if (!checkout.getCheckoutId().equals(id)) continue;
			if (checkout.getCart() == null || checkout.getCart().getProducts() == null) continue;
			List<Product> items = checkout.getCart().getProducts();
			// TODO
		}
		return null;
	}
	
	public static Product deleteItemById(String id, String itemId) {
		for (Checkout checkout : checkouts) {
			if (!checkout.getCheckoutId().equals(id)) continue;
			if (checkout.getCart() == null || checkout.getCart().getProducts() == null) continue;
			Iterator<Product> iterator = checkout.getCart().getProducts().iterator();
			while (iterator.hasNext()) {
				Product item = iterator.next();
				if (item.getId().equals(itemId)) {
					iterator.remove();
					return item;
				}
			}
			
		}
		return null;
	}
}
