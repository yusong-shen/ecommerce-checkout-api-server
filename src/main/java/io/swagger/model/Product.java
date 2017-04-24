package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Product
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-21T21:14:37.723Z")

public class Product   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("price")
  private String price = null;

  @JsonProperty("shipping")
  private String shipping = null;

  @JsonProperty("custom_1")
  private String custom1 = null;

  @JsonProperty("custom_2")
  private String custom2 = null;

  @JsonProperty("custom_3")
  private String custom3 = null;

  public Product id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Product price(String price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public Product shipping(String shipping) {
    this.shipping = shipping;
    return this;
  }

   /**
   * Get shipping
   * @return shipping
  **/
  @ApiModelProperty(value = "")
  public String getShipping() {
    return shipping;
  }

  public void setShipping(String shipping) {
    this.shipping = shipping;
  }

  public Product custom1(String custom1) {
    this.custom1 = custom1;
    return this;
  }

   /**
   * Get custom1
   * @return custom1
  **/
  @ApiModelProperty(value = "")
  public String getCustom1() {
    return custom1;
  }

  public void setCustom1(String custom1) {
    this.custom1 = custom1;
  }

  public Product custom2(String custom2) {
    this.custom2 = custom2;
    return this;
  }

   /**
   * Get custom2
   * @return custom2
  **/
  @ApiModelProperty(value = "")
  public String getCustom2() {
    return custom2;
  }

  public void setCustom2(String custom2) {
    this.custom2 = custom2;
  }

  public Product custom3(String custom3) {
    this.custom3 = custom3;
    return this;
  }

   /**
   * Get custom3
   * @return custom3
  **/
  @ApiModelProperty(value = "")
  public String getCustom3() {
    return custom3;
  }

  public void setCustom3(String custom3) {
    this.custom3 = custom3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.quantity, product.quantity) &&
        Objects.equals(this.price, product.price) &&
        Objects.equals(this.shipping, product.shipping) &&
        Objects.equals(this.custom1, product.custom1) &&
        Objects.equals(this.custom2, product.custom2) &&
        Objects.equals(this.custom3, product.custom3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, quantity, price, shipping, custom1, custom2, custom3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    custom1: ").append(toIndentedString(custom1)).append("\n");
    sb.append("    custom2: ").append(toIndentedString(custom2)).append("\n");
    sb.append("    custom3: ").append(toIndentedString(custom3)).append("\n");
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

