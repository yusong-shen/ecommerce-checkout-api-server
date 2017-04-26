package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Address;
import io.swagger.model.CustomerAttributes;
import io.swagger.model.Product;
import java.util.ArrayList;
import java.util.List;

/**
 * Cart
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-21T21:14:37.723Z")

public class Cart   {
  @JsonProperty("billing_address")
  private Address billingAddress = null;

  @JsonProperty("shipping_address")
  private Address shippingAddress = null;

  @JsonProperty("domestic_shipping_charge")
  private String domesticShippingCharge = null;

  @JsonProperty("shipping_method")
  private String shippingMethod = null;

  @JsonProperty("merchant_currency")
  private String merchantCurrency = null;

  @JsonProperty("charge_insurance")
  private Boolean chargeInsurance = null;

  @JsonProperty("products")
  private List<Product> products = new ArrayList<Product>();

  @JsonProperty("customer_attributes")
  private CustomerAttributes customerAttributes = null;

  public Cart billingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @ApiModelProperty(value = "")
  public Address getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }

  public Cart shippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "")
  public Address getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public Cart domesticShippingCharge(String domesticShippingCharge) {
    this.domesticShippingCharge = domesticShippingCharge;
    return this;
  }

   /**
   * Get domesticShippingCharge
   * @return domesticShippingCharge
  **/
  @ApiModelProperty(value = "")
  public String getDomesticShippingCharge() {
    return domesticShippingCharge;
  }

  public void setDomesticShippingCharge(String domesticShippingCharge) {
    this.domesticShippingCharge = domesticShippingCharge;
  }

  public Cart shippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
    return this;
  }

   /**
   * Get shippingMethod
   * @return shippingMethod
  **/
  @ApiModelProperty(value = "")
  public String getShippingMethod() {
    return shippingMethod;
  }

  public void setShippingMethod(String shippingMethod2) {
    this.shippingMethod = shippingMethod2;
  }

  public Cart merchantCurrency(String merchantCurrency) {
    this.merchantCurrency = merchantCurrency;
    return this;
  }

   /**
   * Merchant's currency code. Defaults to USD.
   * @return merchantCurrency
  **/
  @ApiModelProperty(value = "Merchant's currency code. Defaults to USD.")
  public String getMerchantCurrency() {
    return merchantCurrency;
  }

  public void setMerchantCurrency(String merchantCurrency) {
    this.merchantCurrency = merchantCurrency;
  }

  public Cart chargeInsurance(Boolean chargeInsurance) {
    this.chargeInsurance = chargeInsurance;
    return this;
  }

   /**
   * Get chargeInsurance
   * @return chargeInsurance
  **/
  @ApiModelProperty(value = "")
  public Boolean getChargeInsurance() {
    return chargeInsurance;
  }

  public void setChargeInsurance(Boolean chargeInsurance) {
    this.chargeInsurance = chargeInsurance;
  }

  public Cart products(List<Product> products) {
    this.products = products;
    return this;
  }

  public Cart addProductsItem(Product productsItem) {
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @ApiModelProperty(value = "")
  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  public Cart customerAttributes(CustomerAttributes customerAttributes) {
    this.customerAttributes = customerAttributes;
    return this;
  }

   /**
   * Get customerAttributes
   * @return customerAttributes
  **/
  @ApiModelProperty(value = "")
  public CustomerAttributes getCustomerAttributes() {
    return customerAttributes;
  }

  public void setCustomerAttributes(CustomerAttributes customerAttributes) {
    this.customerAttributes = customerAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cart cart = (Cart) o;
    return Objects.equals(this.billingAddress, cart.billingAddress) &&
        Objects.equals(this.shippingAddress, cart.shippingAddress) &&
        Objects.equals(this.domesticShippingCharge, cart.domesticShippingCharge) &&
        Objects.equals(this.shippingMethod, cart.shippingMethod) &&
        Objects.equals(this.merchantCurrency, cart.merchantCurrency) &&
        Objects.equals(this.chargeInsurance, cart.chargeInsurance) &&
        Objects.equals(this.products, cart.products) &&
        Objects.equals(this.customerAttributes, cart.customerAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, shippingAddress, domesticShippingCharge, shippingMethod, merchantCurrency, chargeInsurance, products, customerAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cart {\n");
    
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    domesticShippingCharge: ").append(toIndentedString(domesticShippingCharge)).append("\n");
    sb.append("    shippingMethod: ").append(toIndentedString(shippingMethod)).append("\n");
    sb.append("    merchantCurrency: ").append(toIndentedString(merchantCurrency)).append("\n");
    sb.append("    chargeInsurance: ").append(toIndentedString(chargeInsurance)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    customerAttributes: ").append(toIndentedString(customerAttributes)).append("\n");
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

