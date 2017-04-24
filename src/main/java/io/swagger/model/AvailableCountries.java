package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Country;
import java.util.ArrayList;
import java.util.List;

/**
 * AvailableCountries
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-21T21:14:37.723Z")

public class AvailableCountries   {
  @JsonProperty("available_shipping_countries")
  private List<Country> availableShippingCountries = new ArrayList<Country>();

  @JsonProperty("available_billing_countries")
  private List<Country> availableBillingCountries = new ArrayList<Country>();

  public AvailableCountries availableShippingCountries(List<Country> availableShippingCountries) {
    this.availableShippingCountries = availableShippingCountries;
    return this;
  }

  public AvailableCountries addAvailableShippingCountriesItem(Country availableShippingCountriesItem) {
    this.availableShippingCountries.add(availableShippingCountriesItem);
    return this;
  }

   /**
   * Get availableShippingCountries
   * @return availableShippingCountries
  **/
  @ApiModelProperty(value = "")
  public List<Country> getAvailableShippingCountries() {
    return availableShippingCountries;
  }

  public void setAvailableShippingCountries(List<Country> availableShippingCountries) {
    this.availableShippingCountries = availableShippingCountries;
  }

  public AvailableCountries availableBillingCountries(List<Country> availableBillingCountries) {
    this.availableBillingCountries = availableBillingCountries;
    return this;
  }

  public AvailableCountries addAvailableBillingCountriesItem(Country availableBillingCountriesItem) {
    this.availableBillingCountries.add(availableBillingCountriesItem);
    return this;
  }

   /**
   * Get availableBillingCountries
   * @return availableBillingCountries
  **/
  @ApiModelProperty(value = "")
  public List<Country> getAvailableBillingCountries() {
    return availableBillingCountries;
  }

  public void setAvailableBillingCountries(List<Country> availableBillingCountries) {
    this.availableBillingCountries = availableBillingCountries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableCountries availableCountries = (AvailableCountries) o;
    return Objects.equals(this.availableShippingCountries, availableCountries.availableShippingCountries) &&
        Objects.equals(this.availableBillingCountries, availableCountries.availableBillingCountries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableShippingCountries, availableBillingCountries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableCountries {\n");
    
    sb.append("    availableShippingCountries: ").append(toIndentedString(availableShippingCountries)).append("\n");
    sb.append("    availableBillingCountries: ").append(toIndentedString(availableBillingCountries)).append("\n");
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

