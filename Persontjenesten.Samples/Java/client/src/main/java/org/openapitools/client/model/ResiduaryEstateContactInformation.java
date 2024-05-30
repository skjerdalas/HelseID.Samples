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
import org.openapitools.client.model.ProbateCertificateType;
import org.openapitools.client.model.ResiduaryEstateContactInformationContactAddress;
import org.openapitools.client.model.ResiduaryEstateContactInformationLawyer;
import org.openapitools.client.model.ResiduaryEstateContactInformationOrganization;
import org.openapitools.client.model.ResiduaryEstateContactInformationPerson;
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
 * Residuary estate contact information  Will be either a Person, a Lawyer or an Organization.  &lt;br&gt;FREG: KontaktinformasjonForDoedsbo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-30T07:50:48.244395087Z[Etc/UTC]", comments = "Generator version: 7.7.0-SNAPSHOT")
public class ResiduaryEstateContactInformation {
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

  public static final String SERIALIZED_NAME_PERSON = "person";
  @SerializedName(SERIALIZED_NAME_PERSON)
  private ResiduaryEstateContactInformationPerson person;

  public static final String SERIALIZED_NAME_LAWYER = "lawyer";
  @SerializedName(SERIALIZED_NAME_LAWYER)
  private ResiduaryEstateContactInformationLawyer lawyer;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private ResiduaryEstateContactInformationOrganization organization;

  public static final String SERIALIZED_NAME_PROBATE_CERTIFICATE_TYPE = "probateCertificateType";
  @SerializedName(SERIALIZED_NAME_PROBATE_CERTIFICATE_TYPE)
  private ProbateCertificateType probateCertificateType;

  public static final String SERIALIZED_NAME_PROBATE_CERTIFICATE_ISSUE_DATE = "probateCertificateIssueDate";
  @SerializedName(SERIALIZED_NAME_PROBATE_CERTIFICATE_ISSUE_DATE)
  private OffsetDateTime probateCertificateIssueDate;

  public static final String SERIALIZED_NAME_CONTACT_ADDRESS = "contactAddress";
  @SerializedName(SERIALIZED_NAME_CONTACT_ADDRESS)
  private ResiduaryEstateContactInformationContactAddress contactAddress;

  public ResiduaryEstateContactInformation() {
  }

  public ResiduaryEstateContactInformation registeredAt(OffsetDateTime registeredAt) {
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


  public ResiduaryEstateContactInformation isValid(Boolean isValid) {
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


  public ResiduaryEstateContactInformation source(String source) {
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


  public ResiduaryEstateContactInformation reason(String reason) {
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


  public ResiduaryEstateContactInformation validFrom(OffsetDateTime validFrom) {
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


  public ResiduaryEstateContactInformation validTo(OffsetDateTime validTo) {
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


  public ResiduaryEstateContactInformation person(ResiduaryEstateContactInformationPerson person) {
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  @javax.annotation.Nullable
  public ResiduaryEstateContactInformationPerson getPerson() {
    return person;
  }

  public void setPerson(ResiduaryEstateContactInformationPerson person) {
    this.person = person;
  }


  public ResiduaryEstateContactInformation lawyer(ResiduaryEstateContactInformationLawyer lawyer) {
    this.lawyer = lawyer;
    return this;
  }

   /**
   * Get lawyer
   * @return lawyer
  **/
  @javax.annotation.Nullable
  public ResiduaryEstateContactInformationLawyer getLawyer() {
    return lawyer;
  }

  public void setLawyer(ResiduaryEstateContactInformationLawyer lawyer) {
    this.lawyer = lawyer;
  }


  public ResiduaryEstateContactInformation organization(ResiduaryEstateContactInformationOrganization organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nullable
  public ResiduaryEstateContactInformationOrganization getOrganization() {
    return organization;
  }

  public void setOrganization(ResiduaryEstateContactInformationOrganization organization) {
    this.organization = organization;
  }


  public ResiduaryEstateContactInformation probateCertificateType(ProbateCertificateType probateCertificateType) {
    this.probateCertificateType = probateCertificateType;
    return this;
  }

   /**
   * Probate certificate type  &lt;br&gt;FREG: Skifteform
   * @return probateCertificateType
  **/
  @javax.annotation.Nullable
  public ProbateCertificateType getProbateCertificateType() {
    return probateCertificateType;
  }

  public void setProbateCertificateType(ProbateCertificateType probateCertificateType) {
    this.probateCertificateType = probateCertificateType;
  }


  public ResiduaryEstateContactInformation probateCertificateIssueDate(OffsetDateTime probateCertificateIssueDate) {
    this.probateCertificateIssueDate = probateCertificateIssueDate;
    return this;
  }

   /**
   * Date of the probate certificate issuance  &lt;br&gt;FREG: Attestutstedelsesdato
   * @return probateCertificateIssueDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getProbateCertificateIssueDate() {
    return probateCertificateIssueDate;
  }

  public void setProbateCertificateIssueDate(OffsetDateTime probateCertificateIssueDate) {
    this.probateCertificateIssueDate = probateCertificateIssueDate;
  }


  public ResiduaryEstateContactInformation contactAddress(ResiduaryEstateContactInformationContactAddress contactAddress) {
    this.contactAddress = contactAddress;
    return this;
  }

   /**
   * Get contactAddress
   * @return contactAddress
  **/
  @javax.annotation.Nullable
  public ResiduaryEstateContactInformationContactAddress getContactAddress() {
    return contactAddress;
  }

  public void setContactAddress(ResiduaryEstateContactInformationContactAddress contactAddress) {
    this.contactAddress = contactAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResiduaryEstateContactInformation residuaryEstateContactInformation = (ResiduaryEstateContactInformation) o;
    return Objects.equals(this.registeredAt, residuaryEstateContactInformation.registeredAt) &&
        Objects.equals(this.isValid, residuaryEstateContactInformation.isValid) &&
        Objects.equals(this.source, residuaryEstateContactInformation.source) &&
        Objects.equals(this.reason, residuaryEstateContactInformation.reason) &&
        Objects.equals(this.validFrom, residuaryEstateContactInformation.validFrom) &&
        Objects.equals(this.validTo, residuaryEstateContactInformation.validTo) &&
        Objects.equals(this.person, residuaryEstateContactInformation.person) &&
        Objects.equals(this.lawyer, residuaryEstateContactInformation.lawyer) &&
        Objects.equals(this.organization, residuaryEstateContactInformation.organization) &&
        Objects.equals(this.probateCertificateType, residuaryEstateContactInformation.probateCertificateType) &&
        Objects.equals(this.probateCertificateIssueDate, residuaryEstateContactInformation.probateCertificateIssueDate) &&
        Objects.equals(this.contactAddress, residuaryEstateContactInformation.contactAddress);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredAt, isValid, source, reason, validFrom, validTo, person, lawyer, organization, probateCertificateType, probateCertificateIssueDate, contactAddress);
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
    sb.append("class ResiduaryEstateContactInformation {\n");
    sb.append("    registeredAt: ").append(toIndentedString(registeredAt)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    lawyer: ").append(toIndentedString(lawyer)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    probateCertificateType: ").append(toIndentedString(probateCertificateType)).append("\n");
    sb.append("    probateCertificateIssueDate: ").append(toIndentedString(probateCertificateIssueDate)).append("\n");
    sb.append("    contactAddress: ").append(toIndentedString(contactAddress)).append("\n");
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
    openapiFields.add("person");
    openapiFields.add("lawyer");
    openapiFields.add("organization");
    openapiFields.add("probateCertificateType");
    openapiFields.add("probateCertificateIssueDate");
    openapiFields.add("contactAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ResiduaryEstateContactInformation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResiduaryEstateContactInformation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResiduaryEstateContactInformation is not found in the empty JSON string", ResiduaryEstateContactInformation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResiduaryEstateContactInformation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResiduaryEstateContactInformation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      // validate the optional field `person`
      if (jsonObj.get("person") != null && !jsonObj.get("person").isJsonNull()) {
        ResiduaryEstateContactInformationPerson.validateJsonElement(jsonObj.get("person"));
      }
      // validate the optional field `lawyer`
      if (jsonObj.get("lawyer") != null && !jsonObj.get("lawyer").isJsonNull()) {
        ResiduaryEstateContactInformationLawyer.validateJsonElement(jsonObj.get("lawyer"));
      }
      // validate the optional field `organization`
      if (jsonObj.get("organization") != null && !jsonObj.get("organization").isJsonNull()) {
        ResiduaryEstateContactInformationOrganization.validateJsonElement(jsonObj.get("organization"));
      }
      // validate the optional field `probateCertificateType`
      if (jsonObj.get("probateCertificateType") != null && !jsonObj.get("probateCertificateType").isJsonNull()) {
        ProbateCertificateType.validateJsonElement(jsonObj.get("probateCertificateType"));
      }
      // validate the optional field `contactAddress`
      if (jsonObj.get("contactAddress") != null && !jsonObj.get("contactAddress").isJsonNull()) {
        ResiduaryEstateContactInformationContactAddress.validateJsonElement(jsonObj.get("contactAddress"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResiduaryEstateContactInformation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResiduaryEstateContactInformation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResiduaryEstateContactInformation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResiduaryEstateContactInformation.class));

       return (TypeAdapter<T>) new TypeAdapter<ResiduaryEstateContactInformation>() {
           @Override
           public void write(JsonWriter out, ResiduaryEstateContactInformation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResiduaryEstateContactInformation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResiduaryEstateContactInformation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResiduaryEstateContactInformation
  * @throws IOException if the JSON string is invalid with respect to ResiduaryEstateContactInformation
  */
  public static ResiduaryEstateContactInformation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResiduaryEstateContactInformation.class);
  }

 /**
  * Convert an instance of ResiduaryEstateContactInformation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
