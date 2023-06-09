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
import io.ActualizaDatosGeneralesSimulacion.client.model.CatalogoEstados;
import java.io.IOException;

/**
 * Obtiene Insights Generator
 */
@ApiModel(description = "Obtiene Insights Generator")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-04T22:09:16.181Z")
public class RequestADG {
  @SerializedName("numOtorgante")
  private String numOtorgante = null;

  @SerializedName("cuenta")
  private String cuenta = null;

  @SerializedName("claveEstado")
  private CatalogoEstados claveEstado = null;

  @SerializedName("cp")
  private String cp = null;

  @SerializedName("folioOtorgante")
  private String folioOtorgante = null;

  public RequestADG numOtorgante(String numOtorgante) {
    this.numOtorgante = numOtorgante;
    return this;
  }

   /**
   * Número de otorgante.
   * @return numOtorgante
  **/
  @ApiModelProperty(example = "000496", required = true, value = "Número de otorgante.")
  public String getNumOtorgante() {
    return numOtorgante;
  }

  public void setNumOtorgante(String numOtorgante) {
    this.numOtorgante = numOtorgante;
  }

  public RequestADG cuenta(String cuenta) {
    this.cuenta = cuenta;
    return this;
  }

   /**
   * Número de cuenta.
   * @return cuenta
  **/
  @ApiModelProperty(example = "IC270220186999", required = true, value = "Número de cuenta.")
  public String getCuenta() {
    return cuenta;
  }

  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  public RequestADG claveEstado(CatalogoEstados claveEstado) {
    this.claveEstado = claveEstado;
    return this;
  }

   /**
   * Get claveEstado
   * @return claveEstado
  **/
  @ApiModelProperty(value = "")
  public CatalogoEstados getClaveEstado() {
    return claveEstado;
  }

  public void setClaveEstado(CatalogoEstados claveEstado) {
    this.claveEstado = claveEstado;
  }

  public RequestADG cp(String cp) {
    this.cp = cp;
    return this;
  }

   /**
   * Código Postal.
   * @return cp
  **/
  @ApiModelProperty(example = "34950", value = "Código Postal.")
  public String getCp() {
    return cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }

  public RequestADG folioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
    return this;
  }

   /**
   * Folio Otorgante
   * @return folioOtorgante
  **/
  @ApiModelProperty(example = "", value = "Folio Otorgante")
  public String getFolioOtorgante() {
    return folioOtorgante;
  }

  public void setFolioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestADG requestADG = (RequestADG) o;
    return Objects.equals(this.numOtorgante, requestADG.numOtorgante) &&
        Objects.equals(this.cuenta, requestADG.cuenta) &&
        Objects.equals(this.claveEstado, requestADG.claveEstado) &&
        Objects.equals(this.cp, requestADG.cp) &&
        Objects.equals(this.folioOtorgante, requestADG.folioOtorgante);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numOtorgante, cuenta, claveEstado, cp, folioOtorgante);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestADG {\n");
    
    sb.append("    numOtorgante: ").append(toIndentedString(numOtorgante)).append("\n");
    sb.append("    cuenta: ").append(toIndentedString(cuenta)).append("\n");
    sb.append("    claveEstado: ").append(toIndentedString(claveEstado)).append("\n");
    sb.append("    cp: ").append(toIndentedString(cp)).append("\n");
    sb.append("    folioOtorgante: ").append(toIndentedString(folioOtorgante)).append("\n");
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

