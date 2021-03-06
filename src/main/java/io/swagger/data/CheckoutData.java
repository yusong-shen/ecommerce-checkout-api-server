package io.swagger.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import io.swagger.model.Address;
import io.swagger.model.AvailablePaymentMethod;
import io.swagger.model.AvailableShippingMethod;
import io.swagger.model.Cart;
import io.swagger.model.Checkout;
import io.swagger.model.CheckoutTotals;
import io.swagger.model.CustomerAttributes;
import io.swagger.model.Product;

public class CheckoutData {

	static List<Checkout> checkouts = new ArrayList<>();
	
	static {
		// hardcoded Checkout instance for testing
		Cart cart = CartData.createCart(null, null, null, null, null, null, new ArrayList<Product>(), null);
    	Checkout checkoutDummy = CheckoutData.createCheckout("1", cart, new ArrayList<AvailableShippingMethod>(), new ArrayList<AvailablePaymentMethod>(), null, null);
    	AvailableShippingMethod sm1 = new AvailableShippingMethod();
    	sm1.setCode("0"); sm1.setName("Express");
    	checkoutDummy.addAvailableShippingMethodsItem(sm1);
    	AvailablePaymentMethod pm1 = new AvailablePaymentMethod();
    	pm1.setCode("0"); pm1.setName("Credit Card");
    	checkoutDummy.addAvailablePaymentMethodsItem(pm1);
    	checkouts.add(checkoutDummy);
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
	
	public static boolean updateItemById(String id, String itemId, Product item) {
		for (Checkout checkout : checkouts) {
			if (!checkout.getCheckoutId().equals(id)) continue;
			if (checkout.getCart() == null || checkout.getCart().getProducts() == null) continue;
			List<Product> items = checkout.getCart().getProducts();
			// first find the first matched position
			int index = -1;
			for (int i = 0; i < items.size(); i++) {
				Product p = items.get(i);
				if (p.getId().equals(itemId)) {
					index = i;
				}
			}
			if (index != -1) {
				items.set(index, item);
				return true;
			}
		}
		return false;
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

	public static boolean updateBillingAddress(String checkoutId, Address body) {
		for (Checkout checkout : checkouts) {
			if (!checkout.getCheckoutId().equals(checkoutId)) continue;
			if (checkout.getCart() == null) continue;
			checkout.getCart().setBillingAddress(body);
			return true;
		}
		return false;
	}

	public static boolean updateShippingAddress(String checkoutId, Address body) {
		for (Checkout checkout : checkouts) {
			if (!checkout.getCheckoutId().equals(checkoutId)) continue;
			if (checkout.getCart() == null) continue;
			checkout.getCart().setShippingAddress(body);
			return true;
		}
		return false;
	}

	public static boolean updateShippingMethod(String checkoutId, String shippingMethod) {
		for (Checkout checkout : checkouts) {
			if (!checkout.getCheckoutId().equals(checkoutId)) continue;
			if (checkout.getCart() == null) continue;
			checkout.getCart().setShippingMethod(shippingMethod);;
			return true;
		}
		return false;		
	}

	public static boolean updateCustomerAttributes(String checkoutId, CustomerAttributes customerAttributes) {
		for (Checkout checkout : checkouts) {
			if (!checkout.getCheckoutId().equals(checkoutId)) continue;
			if (checkout.getCart() == null) continue;
			checkout.getCart().setCustomerAttributes(customerAttributes);
			return true;
		}
		return false;		
	}
}
