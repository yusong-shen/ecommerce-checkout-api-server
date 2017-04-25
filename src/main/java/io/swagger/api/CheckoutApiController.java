package io.swagger.api;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.ApiParam;
import io.swagger.data.AvailableCountriesData;
import io.swagger.data.AvailablePaymentMethodData;
import io.swagger.data.CheckoutData;
import io.swagger.model.Address;
import io.swagger.model.AvailableCountries;
import io.swagger.model.AvailablePaymentMethod;
import io.swagger.model.AvailablePaymentMethodList;
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

    public ResponseEntity<Void> checkoutAvailableLanguagesGet() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<AvailablePaymentMethodList> checkoutCheckoutIdAvailablePaymentMethodsGet(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId) {
        // do some magic!
        return new ResponseEntity<AvailablePaymentMethodList>(HttpStatus.OK);
    }

    public ResponseEntity<AvailableShippingMethodList> checkoutCheckoutIdAvailableShippingMethodsGet(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId) {
        // do some magic!
        return new ResponseEntity<AvailableShippingMethodList>(HttpStatus.OK);
    }

    public ResponseEntity<Checkout> checkoutCheckoutIdBillingAddressPut(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Cart object that needs to be updated" ,required=true ) @RequestBody Address body) {
        // do some magic!
        return new ResponseEntity<Checkout>(HttpStatus.OK);
    }

    public ResponseEntity<Void> checkoutCheckoutIdCustomerAttributesPut(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Customer attributes" ,required=true ) @RequestBody CustomerAttributes customerAttributes) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
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
        @ApiParam(value = "Item Id",required=true ) @PathVariable("itemId") String itemId) {
        // do some magic!
        return new ResponseEntity<Checkout>(HttpStatus.OK);
    }

    public ResponseEntity<Checkout> checkoutCheckoutIdItemsItemIdPut(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Item Id",required=true ) @PathVariable("itemId") String itemId,
        @ApiParam(value = "Item" ,required=true ) @RequestBody Product item) {
        // do some magic!
        return new ResponseEntity<Checkout>(HttpStatus.OK);
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
        @ApiParam(value = "Shipping address" ,required=true ) @RequestBody Address body) {
        // do some magic!
        return new ResponseEntity<Checkout>(HttpStatus.OK);
    }

    public ResponseEntity<Checkout> checkoutCheckoutIdShippingMethodPut(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Shipping method (0: Express, 1: Standard, 2: Economy)", required = true) @RequestParam(value = "shippingMethod", required = true) String shippingMethod) {
        // do some magic!
        return new ResponseEntity<Checkout>(HttpStatus.OK);
    }

    public ResponseEntity<Checkout> createCart(@ApiParam(value = "Includes billing and products info" ,required=true ) @RequestBody Cart cart) {
    	String checkoutId = java.util.UUID.randomUUID().toString();
    	Checkout checkout = CheckoutData.createCheckout(checkoutId, cart, null, null, null, null);
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
