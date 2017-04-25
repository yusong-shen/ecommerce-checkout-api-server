package io.swagger.data;

import java.util.ArrayList;
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
}
