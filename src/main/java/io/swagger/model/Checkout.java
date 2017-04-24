package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AvailablePaymentMethod;
import io.swagger.model.AvailableShippingMethod;
import io.swagger.model.Cart;
import io.swagger.model.CheckoutTotals;
import java.util.ArrayList;
import java.util.List;

/**
 * Checkout
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-21T21:14:37.723Z")

public class Checkout   {
  @JsonProperty("checkout_id")
  private String checkoutId = null;

  @JsonProperty("cart")
  private Cart cart = null;

  @JsonProperty("available_shipping_methods")
  private List<AvailableShippingMethod> availableShippingMethods = new ArrayList<AvailableShippingMethod>();

  @JsonProperty("available_payment_methods")
  private List<AvailablePaymentMethod> availablePaymentMethods = new ArrayList<AvailablePaymentMethod>();

  @JsonProperty("totals")
  private CheckoutTotals totals = null;

  @JsonProperty("merchantTotals")
  private CheckoutTotals merchantTotals = null;

  public Checkout checkoutId(String checkoutId) {
    this.checkoutId = checkoutId;
    return this;
  }

   /**
   * Get checkoutId
   * @return checkoutId
  **/
  @ApiModelProperty(value = "")
  public String getCheckoutId() {
    return checkoutId;
  }

  public void setCheckoutId(String checkoutId) {
    this.checkoutId = checkoutId;
  }

  public Checkout cart(Cart cart) {
    this.cart = cart;
    return this;
  }

   /**
   * Get cart
   * @return cart
  **/
  @ApiModelProperty(value = "")
  public Cart getCart() {
    return cart;
  }

  public void setCart(Cart cart) {
    this.cart = cart;
  }

  public Checkout availableShippingMethods(List<AvailableShippingMethod> availableShippingMethods) {
    this.availableShippingMethods = availableShippingMethods;
    return this;
  }

  public Checkout addAvailableShippingMethodsItem(AvailableShippingMethod availableShippingMethodsItem) {
    this.availableShippingMethods.add(availableShippingMethodsItem);
    return this;
  }

   /**
   * Get availableShippingMethods
   * @return availableShippingMethods
  **/
  @ApiModelProperty(value = "")
  public List<AvailableShippingMethod> getAvailableShippingMethods() {
    return availableShippingMethods;
  }

  public void setAvailableShippingMethods(List<AvailableShippingMethod> availableShippingMethods) {
    this.availableShippingMethods = availableShippingMethods;
  }

  public Checkout availablePaymentMethods(List<AvailablePaymentMethod> availablePaymentMethods) {
    this.availablePaymentMethods = availablePaymentMethods;
    return this;
  }

  public Checkout addAvailablePaymentMethodsItem(AvailablePaymentMethod availablePaymentMethodsItem) {
    this.availablePaymentMethods.add(availablePaymentMethodsItem);
    return this;
  }

   /**
   * Get availablePaymentMethods
   * @return availablePaymentMethods
  **/
  @ApiModelProperty(value = "")
  public List<AvailablePaymentMethod> getAvailablePaymentMethods() {
    return availablePaymentMethods;
  }

  public void setAvailablePaymentMethods(List<AvailablePaymentMethod> availablePaymentMethods) {
    this.availablePaymentMethods = availablePaymentMethods;
  }

  public Checkout totals(CheckoutTotals totals) {
    this.totals = totals;
    return this;
  }

   /**
   * Get totals
   * @return totals
  **/
  @ApiModelProperty(value = "")
  public CheckoutTotals getTotals() {
    return totals;
  }

  public void setTotals(CheckoutTotals totals) {
    this.totals = totals;
  }

  public Checkout merchantTotals(CheckoutTotals merchantTotals) {
    this.merchantTotals = merchantTotals;
    return this;
  }

   /**
   * Get merchantTotals
   * @return merchantTotals
  **/
  @ApiModelProperty(value = "")
  public CheckoutTotals getMerchantTotals() {
    return merchantTotals;
  }

  public void setMerchantTotals(CheckoutTotals merchantTotals) {
    this.merchantTotals = merchantTotals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Checkout checkout = (Checkout) o;
    return Objects.equals(this.checkoutId, checkout.checkoutId) &&
        Objects.equals(this.cart, checkout.cart) &&
        Objects.equals(this.availableShippingMethods, checkout.availableShippingMethods) &&
        Objects.equals(this.availablePaymentMethods, checkout.availablePaymentMethods) &&
        Objects.equals(this.totals, checkout.totals) &&
        Objects.equals(this.merchantTotals, checkout.merchantTotals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutId, cart, availableShippingMethods, availablePaymentMethods, totals, merchantTotals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Checkout {\n");
    
    sb.append("    checkoutId: ").append(toIndentedString(checkoutId)).append("\n");
    sb.append("    cart: ").append(toIndentedString(cart)).append("\n");
    sb.append("    availableShippingMethods: ").append(toIndentedString(availableShippingMethods)).append("\n");
    sb.append("    availablePaymentMethods: ").append(toIndentedString(availablePaymentMethods)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
    sb.append("    merchantTotals: ").append(toIndentedString(merchantTotals)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

