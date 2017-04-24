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
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-21T21:14:37.723Z")

@Api(value = "checkout", description = "the checkout API")
public interface CheckoutApi {

    @ApiOperation(value = "Get available billing and shipping countries", notes = "", response = AvailableCountries.class, tags={ "cart", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Available billing and shipping countries", response = AvailableCountries.class) })
    @RequestMapping(value = "/checkout/availableCountries",
        method = RequestMethod.GET)
    ResponseEntity<AvailableCountries> checkoutAvailableCountriesGet();


    @ApiOperation(value = "Get available languages", notes = "", response = Void.class, tags={ "cart", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucess", response = Void.class) })
    @RequestMapping(value = "/checkout/availableLanguages",
        method = RequestMethod.GET)
    ResponseEntity<Void> checkoutAvailableLanguagesGet();


    @ApiOperation(value = "Get available payment methods", notes = "", response = AvailablePaymentMethodList.class, tags={ "cart", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of payment methods", response = AvailablePaymentMethodList.class),
        @ApiResponse(code = 404, message = "Cart not found", response = AvailablePaymentMethodList.class) })
    @RequestMapping(value = "/checkout/{checkout_id}/availablePaymentMethods",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<AvailablePaymentMethodList> checkoutCheckoutIdAvailablePaymentMethodsGet(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId);


    @ApiOperation(value = "Get shipping info", notes = "", response = AvailableShippingMethodList.class, tags={ "cart", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of shipping methods", response = AvailableShippingMethodList.class),
        @ApiResponse(code = 404, message = "Cart not found", response = AvailableShippingMethodList.class) })
    @RequestMapping(value = "/checkout/{checkout_id}/availableShippingMethods",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<AvailableShippingMethodList> checkoutCheckoutIdAvailableShippingMethodsGet(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId);


    @ApiOperation(value = "Update the billing address", notes = "", response = Checkout.class, tags={ "cart", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Checkout context", response = Checkout.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Checkout.class) })
    @RequestMapping(value = "/checkout/{checkout_id}/billingAddress",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Checkout> checkoutCheckoutIdBillingAddressPut(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Cart object that needs to be updated" ,required=true ) @RequestBody Address body);


    @ApiOperation(value = "Set or update customer attributes", notes = "", response = Void.class, tags={ "cart", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucess", response = Void.class) })
    @RequestMapping(value = "/checkout/{checkout_id}/customerAttributes",
        method = RequestMethod.PUT)
    ResponseEntity<Void> checkoutCheckoutIdCustomerAttributesPut(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Customer attributes" ,required=true ) @RequestBody CustomerAttributes customerAttributes);


    @ApiOperation(value = "Get an existing cart", notes = "", response = Checkout.class, tags={ "cart", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The shopping cart", response = Checkout.class),
        @ApiResponse(code = 405, message = "Invalid input", response = Checkout.class) })
    @RequestMapping(value = "/checkout/{checkout_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Checkout> checkoutCheckoutIdGet(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId);


    @ApiOperation(value = "Delete an item from the shopping cart", notes = "", response = Checkout.class, tags={ "cart", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Checkout context", response = Checkout.class),
        @ApiResponse(code = 405, message = "Invalid input", response = Checkout.class) })
    @RequestMapping(value = "/checkout/{checkout_id}/items/{item_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Checkout> checkoutCheckoutIdItemsItemIdDelete(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Item Id",required=true ) @PathVariable("itemId") String itemId);


    @ApiOperation(value = "Update an existing item from the shopping cart", notes = "", response = Checkout.class, tags={ "cart", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Checkout context", response = Checkout.class),
        @ApiResponse(code = 405, message = "Invalid input", response = Checkout.class) })
    @RequestMapping(value = "/checkout/{checkout_id}/items/{item_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Checkout> checkoutCheckoutIdItemsItemIdPut(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Item Id",required=true ) @PathVariable("itemId") String itemId,
        @ApiParam(value = "Item" ,required=true ) @RequestBody Product item);


    @ApiOperation(value = "Pay the cart total", notes = "", response = Void.class, tags={ "cart", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Void.class) })
    @RequestMapping(value = "/checkout/{checkout_id}/pay",
        method = RequestMethod.POST)
    ResponseEntity<Void> checkoutCheckoutIdPayPost(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Payment method" ,required=true ) @RequestBody PaymentMethod body);


    @ApiOperation(value = "Update the shipping address", notes = "", response = Checkout.class, tags={ "cart", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Checkout context", response = Checkout.class),
        @ApiResponse(code = 404, message = "The cart does not exists", response = Checkout.class) })
    @RequestMapping(value = "/checkout/{checkout_id}/shippingAddress",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Checkout> checkoutCheckoutIdShippingAddressPut(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Shipping address" ,required=true ) @RequestBody Address body);


    @ApiOperation(value = "Set or update the shipping method", notes = "", response = Checkout.class, tags={ "cart", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Checkout context", response = Checkout.class) })
    @RequestMapping(value = "/checkout/{checkout_id}/shippingMethod",
        method = RequestMethod.PUT)
    ResponseEntity<Checkout> checkoutCheckoutIdShippingMethodPut(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Shipping method (0: Express, 1: Standard, 2: Economy)", required = true) @RequestParam(value = "shippingMethod", required = true) String shippingMethod);


    @ApiOperation(value = "Create a possibly empty shopping cart", notes = "", response = Checkout.class, tags={ "cart", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The shopping cart", response = Checkout.class),
        @ApiResponse(code = 400, message = "Invalid input", response = Checkout.class) })
    @RequestMapping(value = "/checkout",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Checkout> createCart(@ApiParam(value = "Includes billing and products info" ,required=true ) @RequestBody Cart cart);


    @ApiOperation(value = "Add a new item to the shopping cart", notes = "", response = Checkout.class, tags={ "cart", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Checkout context", response = Checkout.class),
        @ApiResponse(code = 405, message = "Invalid input", response = Checkout.class) })
    @RequestMapping(value = "/checkout/{checkout_id}/items",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Checkout> createItem(@ApiParam(value = "Checkout Id",required=true ) @PathVariable("checkoutId") String checkoutId,
        @ApiParam(value = "Item to be added to the cart" ,required=true ) @RequestBody Product item);

}
