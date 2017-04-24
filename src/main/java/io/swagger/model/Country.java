package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Country
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-21T21:14:37.723Z")

public class Country   {
  @JsonProperty("country_code")
  private String countryCode = null;

  @JsonProperty("country_name")
  private String countryName = null;

  @JsonProperty("country_phone_code")
  private String countryPhoneCode = null;

  public Country countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Country countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * Get countryName
   * @return countryName
  **/
  @ApiModelProperty(value = "")
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public Country countryPhoneCode(String countryPhoneCode) {
    this.countryPhoneCode = countryPhoneCode;
    return this;
  }

   /**
   * Get countryPhoneCode
   * @return countryPhoneCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryPhoneCode() {
    return countryPhoneCode;
  }

  public void setCountryPhoneCode(String countryPhoneCode) {
    this.countryPhoneCode = countryPhoneCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Country country = (Country) o;
    return Objects.equals(this.countryCode, country.countryCode) &&
        Objects.equals(this.countryName, country.countryName) &&
        Objects.equals(this.countryPhoneCode, country.countryPhoneCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, countryName, countryPhoneCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    countryPhoneCode: ").append(toIndentedString(countryPhoneCode)).append("\n");
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

