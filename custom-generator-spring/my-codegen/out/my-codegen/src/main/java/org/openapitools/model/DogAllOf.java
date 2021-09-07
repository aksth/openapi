package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DogAllOf
 */
@javax.annotation.Generated(value = "com.my.company.codegen.MyCodegenGenerator", date = "2021-08-05T14:04:37.728897+05:45[Asia/Kathmandu]")
public class DogAllOf   {
  @JsonProperty("barks")
  private Boolean barks;

  /**
   * Gets or Sets breed
   */
  public enum BreedEnum {
    DINGO("Dingo"),
    
    HUSKY("Husky"),
    
    RETRIEVER("Retriever"),
    
    SHEPHERD("Shepherd");

    private String value;

    BreedEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BreedEnum fromValue(String value) {
      for (BreedEnum b : BreedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("breed")
  private BreedEnum breed;

  public DogAllOf barks(Boolean barks) {
    this.barks = barks;
    return this;
  }

  /**
   * Get barks
   * @return barks
  */
  @ApiModelProperty(value = "")


  public Boolean getBarks() {
    return barks;
  }

  public void setBarks(Boolean barks) {
    this.barks = barks;
  }

  public DogAllOf breed(BreedEnum breed) {
    this.breed = breed;
    return this;
  }

  /**
   * Get breed
   * @return breed
  */
  @ApiModelProperty(value = "")


  public BreedEnum getBreed() {
    return breed;
  }

  public void setBreed(BreedEnum breed) {
    this.breed = breed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DogAllOf dogAllOf = (DogAllOf) o;
    return Objects.equals(this.barks, dogAllOf.barks) &&
        Objects.equals(this.breed, dogAllOf.breed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barks, breed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DogAllOf {\n");
    
    sb.append("    barks: ").append(toIndentedString(barks)).append("\n");
    sb.append("    breed: ").append(toIndentedString(breed)).append("\n");
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

