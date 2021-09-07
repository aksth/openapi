package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CatAllOf
 */
@javax.annotation.Generated(value = "com.my.company.codegen.MyCodegenGenerator", date = "2021-08-05T14:04:37.728897+05:45[Asia/Kathmandu]")
public class CatAllOf   {
  @JsonProperty("hunts")
  private Boolean hunts;

  @JsonProperty("age")
  private Integer age;

  public CatAllOf hunts(Boolean hunts) {
    this.hunts = hunts;
    return this;
  }

  /**
   * Get hunts
   * @return hunts
  */
  @ApiModelProperty(value = "")


  public Boolean getHunts() {
    return hunts;
  }

  public void setHunts(Boolean hunts) {
    this.hunts = hunts;
  }

  public CatAllOf age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  @ApiModelProperty(value = "")


  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatAllOf catAllOf = (CatAllOf) o;
    return Objects.equals(this.hunts, catAllOf.hunts) &&
        Objects.equals(this.age, catAllOf.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hunts, age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatAllOf {\n");
    
    sb.append("    hunts: ").append(toIndentedString(hunts)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

