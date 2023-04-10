/*
 * Actualiza Datos Generales API Simulacion
 * <p>API de Actualiza Datos Generales.</p><br/><br><img src='https://developer.circulodecredito.com.mx/sites/default/files/2020-10/circulo_de_credito-apihub.png' height='40' width='220'/></p><br/>
 *
 * OpenAPI spec version: 1.0.0
 * Contact: api@circulodecredito.com.mx
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.ActualizaDatosGeneralesSimulacion.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.ActualizaDatosGeneralesSimulacion.client.model.RespuestaADGDomicilioADG;
import io.ActualizaDatosGeneralesSimulacion.client.model.RespuestaADGEmpleoADG;
import io.ActualizaDatosGeneralesSimulacion.client.model.RespuestaADGPersonaADG;
import io.ActualizaDatosGeneralesSimulacion.client.model.RespuestaADGVariablesDomicilio;
import java.io.IOException;

/**
 * RespuestaADG
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-04T22:09:16.181Z")
public class RespuestaADG {
  @SerializedName("personaADG")
  private RespuestaADGPersonaADG personaADG = null;

  @SerializedName("domicilioADG")
  private RespuestaADGDomicilioADG domicilioADG = null;

  @SerializedName("empleoADG")
  private RespuestaADGEmpleoADG empleoADG = null;

  @SerializedName("VariablesDomicilio")
  private RespuestaADGVariablesDomicilio variablesDomicilio = null;

  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("folioConsulta")
  private String folioConsulta = null;

  public RespuestaADG personaADG(RespuestaADGPersonaADG personaADG) {
    this.personaADG = personaADG;
    return this;
  }

   /**
   * Get personaADG
   * @return personaADG
  **/
  @ApiModelProperty(value = "")
  public RespuestaADGPersonaADG getPersonaADG() {
    return personaADG;
  }

  public void setPersonaADG(RespuestaADGPersonaADG personaADG) {
    this.personaADG = personaADG;
  }

  public RespuestaADG domicilioADG(RespuestaADGDomicilioADG domicilioADG) {
    this.domicilioADG = domicilioADG;
    return this;
  }

   /**
   * Get domicilioADG
   * @return domicilioADG
  **/
  @ApiModelProperty(value = "")
  public RespuestaADGDomicilioADG getDomicilioADG() {
    return domicilioADG;
  }

  public void setDomicilioADG(RespuestaADGDomicilioADG domicilioADG) {
    this.domicilioADG = domicilioADG;
  }

  public RespuestaADG empleoADG(RespuestaADGEmpleoADG empleoADG) {
    this.empleoADG = empleoADG;
    return this;
  }

   /**
   * Get empleoADG
   * @return empleoADG
  **/
  @ApiModelProperty(value = "")
  public RespuestaADGEmpleoADG getEmpleoADG() {
    return empleoADG;
  }

  public void setEmpleoADG(RespuestaADGEmpleoADG empleoADG) {
    this.empleoADG = empleoADG;
  }

  public RespuestaADG variablesDomicilio(RespuestaADGVariablesDomicilio variablesDomicilio) {
    this.variablesDomicilio = variablesDomicilio;
    return this;
  }

   /**
   * Get variablesDomicilio
   * @return variablesDomicilio
  **/
  @ApiModelProperty(value = "")
  public RespuestaADGVariablesDomicilio getVariablesDomicilio() {
    return variablesDomicilio;
  }

  public void setVariablesDomicilio(RespuestaADGVariablesDomicilio variablesDomicilio) {
    this.variablesDomicilio = variablesDomicilio;
  }

  public RespuestaADG success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public RespuestaADG description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Solicitud procesada exitosamente.", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RespuestaADG folioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
    return this;
  }

   /**
   * Get folioConsulta
   * @return folioConsulta
  **/
  @ApiModelProperty(example = "390019042", value = "")
  public String getFolioConsulta() {
    return folioConsulta;
  }

  public void setFolioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RespuestaADG respuestaADG = (RespuestaADG) o;
    return Objects.equals(this.personaADG, respuestaADG.personaADG) &&
        Objects.equals(this.domicilioADG, respuestaADG.domicilioADG) &&
        Objects.equals(this.empleoADG, respuestaADG.empleoADG) &&
        Objects.equals(this.variablesDomicilio, respuestaADG.variablesDomicilio) &&
        Objects.equals(this.success, respuestaADG.success) &&
        Objects.equals(this.description, respuestaADG.description) &&
        Objects.equals(this.folioConsulta, respuestaADG.folioConsulta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personaADG, domicilioADG, empleoADG, variablesDomicilio, success, description, folioConsulta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespuestaADG {\n");
    
    sb.append("    personaADG: ").append(toIndentedString(personaADG)).append("\n");
    sb.append("    domicilioADG: ").append(toIndentedString(domicilioADG)).append("\n");
    sb.append("    empleoADG: ").append(toIndentedString(empleoADG)).append("\n");
    sb.append("    variablesDomicilio: ").append(toIndentedString(variablesDomicilio)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
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
