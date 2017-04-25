package io.swagger.api;

import io.swagger.model.Address;
import io.swagger.model.AvailableCountries;
import io.swagger.model.AvailablePaymentMethodList;
import io.swagger.model.AvailableShippingMethodList;
import io.swagger.model.Cart;
import io.swagger.model.Checkout;
import io.swagger.model.CustomerAttributes;
import io.swagger.model.PaymentMethod;
import io.swagger.model.Product;

import io.swagger.annotations.*;
import io.swagger.data.AvailableCountriesData;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-21T21:14:37.723Z")

@Controller
public class CheckoutApiController implements CheckoutApi {

    public ResponseEntity<AvailableCountries> checkoutAvailableCountriesGet() {
        // do some magic!
    	AvailableCountriesData data = new AvailableCountriesData();
    	AvailableCountries availableCountries = data.getData();
    	
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

    public ResponseEntity<Checkout> checkoutCheckoutIdGet(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId) {
        // do some magic!
        return new ResponseEntity<Checkout>(HttpStatus.OK);
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
        @ApiParam(value = "Payment method" ,required=true ) @RequestBody PaymentMethod body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
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
        // do some magic!
        return new ResponseEntity<Checkout>(HttpStatus.OK);
    }

    public ResponseEntity<Checkout> createItem(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Item to be added to the cart" ,required=true ) @RequestBody Product item) {
        // do some magic!
        return new ResponseEntity<Checkout>(HttpStatus.OK);
    }

}
