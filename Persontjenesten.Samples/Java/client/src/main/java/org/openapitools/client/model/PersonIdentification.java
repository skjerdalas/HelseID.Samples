/*
 * Persontjenesten API - ET
 * The Person API provides information on norwegian citizens for the norwegian public health sector, and is maintained by [Norsk helsenett](https://www.nhn.no/).  An API changelog is available [here](../static/changelog/index.html).  For more documentation and a complete integration guide, see the [NHN developer portal](https://utviklerportal.nhn.no/informasjonstjenester/persontjenesten/). 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Identification for a person, used for foreign persons identification and immigration authorities identification  &lt;br&gt;FREG: Personidentifikasjon  
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-30T07:50:48.244395087Z[Etc/UTC]", comments = "Generator version: 7.7.0-SNAPSHOT")
public class PersonIdentification {
  public static final String SERIALIZED_NAME_REGISTERED_AT = "registeredAt";
  @SerializedName(SERIALIZED_NAME_REGISTERED_AT)
  private OffsetDateTime registeredAt;

  public static final String SERIALIZED_NAME_IS_VALID = "isValid";
  @SerializedName(SERIALIZED_NAME_IS_VALID)
  private Boolean isValid;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_VALID_FROM = "validFrom";
  @SerializedName(SERIALIZED_NAME_VALID_FROM)
  private OffsetDateTime validFrom;

  public static final String SERIALIZED_NAME_VALID_TO = "validTo";
  @SerializedName(SERIALIZED_NAME_VALID_TO)
  private OffsetDateTime validTo;

  public static final String SERIALIZED_NAME_IDENTIFICATION_NUMBER = "identificationNumber";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATION_NUMBER)
  private String identificationNumber;

  public static final String SERIALIZED_NAME_IDENTIFICATION_NUMBER_TYPE = "identificationNumberType";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATION_NUMBER_TYPE)
  private String identificationNumberType;

  public static final String SERIALIZED_NAME_ISSUER_COUNTRY = "issuerCountry";
  @SerializedName(SERIALIZED_NAME_ISSUER_COUNTRY)
  private String issuerCountry;

  public PersonIdentification() {
  }

  public PersonIdentification registeredAt(OffsetDateTime registeredAt) {
    this.registeredAt = registeredAt;
    return this;
  }

   /**
   * &lt;br&gt;FREG: Ajourholdstidspunkt
   * @return registeredAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getRegisteredAt() {
    return registeredAt;
  }

  public void setRegisteredAt(OffsetDateTime registeredAt) {
    this.registeredAt = registeredAt;
  }


  public PersonIdentification isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

   /**
   * &lt;br&gt;FREG: ErGjeldende
   * @return isValid
  **/
  @javax.annotation.Nullable
  public Boolean getIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }


  public PersonIdentification source(String source) {
    this.source = source;
    return this;
  }

   /**
   * &lt;br&gt;FREG: Kilde
   * @return source
  **/
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  public PersonIdentification reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * &lt;br&gt;FREG: Aarsak
   * @return reason
  **/
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  public PersonIdentification validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

   /**
   * &lt;br&gt;FREG: Gyldighetstidspunkt
   * @return validFrom
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }


  public PersonIdentification validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

   /**
   * &lt;br&gt;FREG: Opphoerstidspunkt
   * @return validTo
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }


  public PersonIdentification identificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
    return this;
  }

   /**
   * The identification number  &lt;br&gt;FREG: Identifikasjonsnummer
   * @return identificationNumber
  **/
  @javax.annotation.Nullable
  public String getIdentificationNumber() {
    return identificationNumber;
  }

  public void setIdentificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
  }


  public PersonIdentification identificationNumberType(String identificationNumberType) {
    this.identificationNumberType = identificationNumberType;
    return this;
  }

   /**
   * Type of foreign identification  Possible values:  - utenlandskIdentifikasjonsnummer &#x3D; Foreign identification number  - taxIdentificationNumber &#x3D; Tax Identification Number(TIN)  - socialSecurityNumber &#x3D; Social Security Number(SSN)  - utlendingsmyndighetenesIdentifikasjonsnummer &#x3D; \&quot;DUF-nummer\&quot; from the Norwegian UDI, for now  &lt;br&gt;FREG: Identifikasjonsnummertype
   * @return identificationNumberType
  **/
  @javax.annotation.Nullable
  public String getIdentificationNumberType() {
    return identificationNumberType;
  }

  public void setIdentificationNumberType(String identificationNumberType) {
    this.identificationNumberType = identificationNumberType;
  }


  public PersonIdentification issuerCountry(String issuerCountry) {
    this.issuerCountry = issuerCountry;
    return this;
  }

   /**
   * Country codes given in ISO 3166-1 Alpha 3  Always NOR for Person.ImmigrationAuthoritiesIdentificationNumber  XXK &#x3D; Kosovo  &lt;br&gt;FREG: Utstederland
   * @return issuerCountry
  **/
  @javax.annotation.Nullable
  public String getIssuerCountry() {
    return issuerCountry;
  }

  public void setIssuerCountry(String issuerCountry) {
    this.issuerCountry = issuerCountry;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonIdentification personIdentification = (PersonIdentification) o;
    return Objects.equals(this.registeredAt, personIdentification.registeredAt) &&
        Objects.equals(this.isValid, personIdentification.isValid) &&
        Objects.equals(this.source, personIdentification.source) &&
        Objects.equals(this.reason, personIdentification.reason) &&
        Objects.equals(this.validFrom, personIdentification.validFrom) &&
        Objects.equals(this.validTo, personIdentification.validTo) &&
        Objects.equals(this.identificationNumber, personIdentification.identificationNumber) &&
        Objects.equals(this.identificationNumberType, personIdentification.identificationNumberType) &&
        Objects.equals(this.issuerCountry, personIdentification.issuerCountry);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredAt, isValid, source, reason, validFrom, validTo, identificationNumber, identificationNumberType, issuerCountry);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonIdentification {\n");
    sb.append("    registeredAt: ").append(toIndentedString(registeredAt)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    identificationNumber: ").append(toIndentedString(identificationNumber)).append("\n");
    sb.append("    identificationNumberType: ").append(toIndentedString(identificationNumberType)).append("\n");
    sb.append("    issuerCountry: ").append(toIndentedString(issuerCountry)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("registeredAt");
    openapiFields.add("isValid");
    openapiFields.add("source");
    openapiFields.add("reason");
    openapiFields.add("validFrom");
    openapiFields.add("validTo");
    openapiFields.add("identificationNumber");
    openapiFields.add("identificationNumberType");
    openapiFields.add("issuerCountry");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PersonIdentification
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PersonIdentification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonIdentification is not found in the empty JSON string", PersonIdentification.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PersonIdentification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PersonIdentification` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if ((jsonObj.get("identificationNumber") != null && !jsonObj.get("identificationNumber").isJsonNull()) && !jsonObj.get("identificationNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identificationNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identificationNumber").toString()));
      }
      if ((jsonObj.get("identificationNumberType") != null && !jsonObj.get("identificationNumberType").isJsonNull()) && !jsonObj.get("identificationNumberType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identificationNumberType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identificationNumberType").toString()));
      }
      if ((jsonObj.get("issuerCountry") != null && !jsonObj.get("issuerCountry").isJsonNull()) && !jsonObj.get("issuerCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerCountry").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonIdentification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonIdentification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonIdentification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonIdentification.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonIdentification>() {
           @Override
           public void write(JsonWriter out, PersonIdentification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PersonIdentification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PersonIdentification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonIdentification
  * @throws IOException if the JSON string is invalid with respect to PersonIdentification
  */
  public static PersonIdentification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonIdentification.class);
  }

 /**
  * Convert an instance of PersonIdentification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
