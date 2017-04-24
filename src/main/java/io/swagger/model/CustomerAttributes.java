package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CustomerAttributes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-21T21:14:37.723Z")

public class CustomerAttributes   {
  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("timezone")
  private String timezone = null;

  @JsonProperty("ip")
  private String ip = null;

  public CustomerAttributes locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * i.e. en_US
   * @return locale
  **/
  @ApiModelProperty(value = "i.e. en_US")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public CustomerAttributes timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(value = "")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public CustomerAttributes ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @ApiModelProperty(value = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAttributes customerAttributes = (CustomerAttributes) o;
    return Objects.equals(this.locale, customerAttributes.locale) &&
        Objects.equals(this.timezone, customerAttributes.timezone) &&
        Objects.equals(this.ip, customerAttributes.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale, timezone, ip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAttributes {\n");
    
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

