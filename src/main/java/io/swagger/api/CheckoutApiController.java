package io.swagger.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.ApiParam;
import io.swagger.data.AvailableCountriesData;
import io.swagger.data.AvailablePaymentMethodData;
import io.swagger.data.AvailablePaymentMethodListData;
import io.swagger.data.AvailableShippingMethodListData;
import io.swagger.data.CheckoutData;
import io.swagger.model.Address;
import io.swagger.model.AvailableCountries;
import io.swagger.model.AvailablePaymentMethod;
import io.swagger.model.AvailablePaymentMethodList;
import io.swagger.model.AvailableShippingMethod;
import io.swagger.model.AvailableShippingMethodList;
import io.swagger.model.Cart;
import io.swagger.model.Checkout;
import io.swagger.model.CustomerAttributes;
import io.swagger.model.PaymentMethod;
import io.swagger.model.Product;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-21T21:14:37.723Z")

@Controller
public class CheckoutApiController implements CheckoutApi {

	
    public ResponseEntity<AvailableCountries> checkoutAvailableCountriesGet() {
    	AvailableCountries availableCountries = AvailableCountriesData.getData();
        return ResponseEntity.ok().body(availableCountries);
    }

    public ResponseEntity<AvailablePaymentMethodList> checkoutCheckoutIdAvailablePaymentMethodsGet(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId) throws Exception{
    	Checkout checkout = CheckoutData.getById(checkoutId);
		if (checkout != null) {
			List<AvailablePaymentMethod> lst = checkout.getAvailablePaymentMethods();
			AvailablePaymentMethodList availablePaymentMethodList = AvailablePaymentMethodListData.create(lst);
			return ResponseEntity.ok().body(availablePaymentMethodList);
		} else {
			throw new NotFoundException(io.swagger.api.ApiResponseMessage.ERROR, "Checkout " + checkout + " not found");
		} 	
    }

    public ResponseEntity<AvailableShippingMethodList> checkoutCheckoutIdAvailableShippingMethodsGet(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId) throws Exception {
    	Checkout checkout = CheckoutData.getById(checkoutId);
		if (checkout != null) {
			List<AvailableShippingMethod> lst = checkout.getAvailableShippingMethods();
			AvailableShippingMethodList availableShippingMethodList = AvailableShippingMethodListData.create(lst);
			return ResponseEntity.ok().body(availableShippingMethodList);
		} else {
			throw new NotFoundException(io.swagger.api.ApiResponseMessage.ERROR, "Checkout " + checkout + " not found");
		} 
    }

    public ResponseEntity<Checkout> checkoutCheckoutIdBillingAddressPut(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Cart object that needs to be updated" ,required=true ) @RequestBody Address body) throws Exception {
    	Checkout checkout = CheckoutData.getById(checkoutId);
		if (checkout != null) {
			CheckoutData.updateBillingAddress(checkoutId, body);
			return ResponseEntity.ok().body(checkout);
		} else {
			throw new NotFoundException(io.swagger.api.ApiResponseMessage.ERROR, "Checkout " + checkout + " not found");
		} 
    }

    public ResponseEntity<Checkout> checkoutCheckoutIdCustomerAttributesPut(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Customer attributes" ,required=true ) @RequestBody CustomerAttributes customerAttributes) throws Exception {
    	Checkout checkout = CheckoutData.getById(checkoutId);
		if (checkout != null) {
			CheckoutData.updateCustomerAttributes(checkoutId, customerAttributes);
			return ResponseEntity.ok().body(checkout);
		} else {
			throw new NotFoundException(io.swagger.api.ApiResponseMessage.ERROR, "Checkout " + checkout + " not found");
		} 

    }

    public ResponseEntity<Checkout> checkoutCheckoutIdGet(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId) throws Exception {
    	Checkout checkout = CheckoutData.getById(checkoutId);
		if (checkout != null) {
			return ResponseEntity.ok().body(checkout);
		} else {
			throw new NotFoundException(io.swagger.api.ApiResponseMessage.ERROR, "Checkout " + checkout + " not found");
		}
    }

    public ResponseEntity<Checkout> checkoutCheckoutIdItemsItemIdDelete(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Item Id",required=true ) @PathVariable("itemId") String itemId) throws Exception {
    	Checkout checkout = CheckoutData.getById(checkoutId);
		if (checkout != null) {
			CheckoutData.deleteItemById(checkoutId, itemId);
			return ResponseEntity.ok().body(checkout);
		} else {
			throw new NotFoundException(io.swagger.api.ApiResponseMessage.ERROR, "Checkout " + checkoutId + " not found");
		}
    }

    public ResponseEntity<Checkout> checkoutCheckoutIdItemsItemIdPut(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Item Id",required=true ) @PathVariable("itemId") String itemId,
        @ApiParam(value = "Item" ,required=true ) @RequestBody Product item) throws Exception {
    	Checkout checkout = CheckoutData.getById(checkoutId);
		if (checkout != null) {
			CheckoutData.updateItemById(checkoutId, itemId, item);
			return ResponseEntity.ok().body(checkout);
		} else {
			throw new NotFoundException(io.swagger.api.ApiResponseMessage.ERROR, "Checkout " + checkoutId + " not found");
		}
    }

    public ResponseEntity<Void> checkoutCheckoutIdPayPost(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Payment method" ,required=true ) @RequestBody PaymentMethod body) throws Exception {
    	Checkout checkout = CheckoutData.getById(checkoutId);
		if (checkout != null) {
			AvailablePaymentMethod availablePaymentMethod = AvailablePaymentMethodData.createAvailablePaymentMethod(body);
			if (checkout.getAvailablePaymentMethods() == null) checkout.setAvailablePaymentMethods(new ArrayList<AvailablePaymentMethod>());
			checkout.getAvailablePaymentMethods().add(availablePaymentMethod);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			throw new NotFoundException(io.swagger.api.ApiResponseMessage.ERROR, "Checkout " + checkoutId + " not found");
		}
    	
    }

    public ResponseEntity<Checkout> checkoutCheckoutIdShippingAddressPut(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Shipping address" ,required=true ) @RequestBody Address body) throws Exception {
    	Checkout checkout = CheckoutData.getById(checkoutId);
		if (checkout != null) {
			CheckoutData.updateShippingAddress(checkoutId, body);
			return ResponseEntity.ok().body(checkout);
		} else {
			throw new NotFoundException(io.swagger.api.ApiResponseMessage.ERROR, "Checkout " + checkout + " not found");
		} 
    }

    public ResponseEntity<Checkout> checkoutCheckoutIdShippingMethodPut(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Shipping method (0: Express, 1: Standard, 2: Economy)", required = true) @RequestParam(value = "shippingMethod", required = true) String shippingMethod) throws Exception {
    	Checkout checkout = CheckoutData.getById(checkoutId);
		if (checkout != null) {
			CheckoutData.updateShippingMethod(checkoutId, shippingMethod);
			return ResponseEntity.ok().body(checkout);
		} else {
			throw new NotFoundException(io.swagger.api.ApiResponseMessage.ERROR, "Checkout " + checkout + " not found");
		}     	
    }

    public ResponseEntity<Checkout> createCart(@ApiParam(value = "Includes billing and products info" ,required=true ) @RequestBody Cart cart) {
    	String checkoutId = java.util.UUID.randomUUID().toString();
    	// set default available payment method and shipping method
    	Checkout checkout = CheckoutData.createCheckout(checkoutId, cart, new ArrayList<AvailableShippingMethod>(), new ArrayList<AvailablePaymentMethod>(), null, null);
    	AvailableShippingMethod sm1 = new AvailableShippingMethod();
    	sm1.setCode("0"); sm1.setName("Express");
    	checkout.addAvailableShippingMethodsItem(sm1);
    	AvailablePaymentMethod pm1 = new AvailablePaymentMethod();
    	pm1.setCode("0"); pm1.setName("Credit Card");
    	checkout.addAvailablePaymentMethodsItem(pm1);
    	CheckoutData.addCheckout(checkout);
        return ResponseEntity.ok().body(checkout);
    }

    public ResponseEntity<Checkout> createItem(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Item to be added to the cart" ,required=true ) @RequestBody Product item) throws Exception {
    	Checkout checkout = CheckoutData.getById(checkoutId);
		if (checkout != null) {
			if (checkout.getCart() != null && checkout.getCart().getProducts() == null) {
				 checkout.getCart().setProducts(new ArrayList<Product>());
			}
			checkout.getCart().getProducts().add(item);
			return ResponseEntity.ok().body(checkout);
		} else {
			throw new NotFoundException(io.swagger.api.ApiResponseMessage.ERROR, "Checkout " + checkoutId + " not found");
		}
    }

}
