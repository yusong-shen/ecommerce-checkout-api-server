package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CheckoutSubTotal;
import io.swagger.model.ProductSubTotal;
import java.util.ArrayList;
import java.util.List;

/**
 * CheckoutTotals
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-21T21:14:37.723Z")

public class CheckoutTotals   {
  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("productSubTotals")
  private List<ProductSubTotal> productSubTotals = new ArrayList<ProductSubTotal>();

  @JsonProperty("subTotals")
  private List<CheckoutSubTotal> subTotals = new ArrayList<CheckoutSubTotal>();

  @JsonProperty("total")
  private String total = null;

  public CheckoutTotals currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public CheckoutTotals productSubTotals(List<ProductSubTotal> productSubTotals) {
    this.productSubTotals = productSubTotals;
    return this;
  }

  public CheckoutTotals addProductSubTotalsItem(ProductSubTotal productSubTotalsItem) {
    this.productSubTotals.add(productSubTotalsItem);
    return this;
  }

   /**
   * Get productSubTotals
   * @return productSubTotals
  **/
  @ApiModelProperty(value = "")
  public List<ProductSubTotal> getProductSubTotals() {
    return productSubTotals;
  }

  public void setProductSubTotals(List<ProductSubTotal> productSubTotals) {
    this.productSubTotals = productSubTotals;
  }

  public CheckoutTotals subTotals(List<CheckoutSubTotal> subTotals) {
    this.subTotals = subTotals;
    return this;
  }

  public CheckoutTotals addSubTotalsItem(CheckoutSubTotal subTotalsItem) {
    this.subTotals.add(subTotalsItem);
    return this;
  }

   /**
   * Get subTotals
   * @return subTotals
  **/
  @ApiModelProperty(value = "")
  public List<CheckoutSubTotal> getSubTotals() {
    return subTotals;
  }

  public void setSubTotals(List<CheckoutSubTotal> subTotals) {
    this.subTotals = subTotals;
  }

  public CheckoutTotals total(String total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public String getTotal() {
    return total;
  }

  public void setTotal(String total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutTotals checkoutTotals = (CheckoutTotals) o;
    return Objects.equals(this.currency, checkoutTotals.currency) &&
        Objects.equals(this.productSubTotals, checkoutTotals.productSubTotals) &&
        Objects.equals(this.subTotals, checkoutTotals.subTotals) &&
        Objects.equals(this.total, checkoutTotals.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, productSubTotals, subTotals, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutTotals {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    productSubTotals: ").append(toIndentedString(productSubTotals)).append("\n");
    sb.append("    subTotals: ").append(toIndentedString(subTotals)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

