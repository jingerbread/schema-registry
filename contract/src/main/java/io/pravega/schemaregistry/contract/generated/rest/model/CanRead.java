/*
 * Pravega Schema Registry APIs
 * REST APIs for Pravega Schema Registry.
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.pravega.schemaregistry.contract.generated.rest.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Response object for canRead api.
 */
@ApiModel(description = "Response object for canRead api.")

public class CanRead   {
  @JsonProperty("compatible")
  private Boolean compatible = null;

  public CanRead compatible(Boolean compatible) {
    this.compatible = compatible;
    return this;
  }

  /**
   * Whether given schema is compatible and can be used for reads. Compatibility is checked against existing group schemas subject to group&#39;s configured compatibility policy.
   * @return compatible
   **/
  @JsonProperty("compatible")
  @ApiModelProperty(required = true, value = "Whether given schema is compatible and can be used for reads. Compatibility is checked against existing group schemas subject to group's configured compatibility policy.")
  @NotNull
  public Boolean isCompatible() {
    return compatible;
  }

  public void setCompatible(Boolean compatible) {
    this.compatible = compatible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CanRead canRead = (CanRead) o;
    return Objects.equals(this.compatible, canRead.compatible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compatible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CanRead {\n");
    
    sb.append("    compatible: ").append(toIndentedString(compatible)).append("\n");
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

