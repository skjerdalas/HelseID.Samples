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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Information parts available for filtering&lt;p&gt;Possible values:&lt;/p&gt;&lt;ul&gt;&lt;li&gt;&lt;i&gt;AddressProtection&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;CitizenshipRetention&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;ResidentialAddress&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;UseOfSamiLanguage&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;SharedResidence&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;Death&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;FalseIdentity&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;FamilyRelation&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;Birth&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;BirthInNorway&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;ParentalResponsibility&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;SamiParliamentElectoralRegistryStatus&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;NorwegianIdentificationNumber&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;IdentityVerification&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;ImmigrationToNorway&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;Gender&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;ResiduaryEstateContactInformation&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;IdentificationDocument&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;Name&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;ResidencePermit&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;StayOnSvalbard&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;PresentAddress&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;PostalAddress&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;ForeignPostalAddress&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;PreferredContactAddress&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;MaritalStatus&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;Citizenship&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;Status&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;ForeignPersonIdentificationNumber&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;EmigrationFromNorway&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;ImmigrationAuthoritiesIdentificationNumber&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;GuardianshipOrFuturePowerOfAttorney&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;DeprivedLegalAuthority&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;CommonContactRegisterInformation&lt;/i&gt; - Show&lt;/li&gt;&lt;li&gt;&lt;i&gt;LegalAuthority&lt;/i&gt; - Show&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;Possible values:&lt;/p&gt;&lt;ul&gt;&lt;/ul&gt;
 */
@JsonAdapter(InformationPart.Adapter.class)
public enum InformationPart {
  
  ADDRESS_PROTECTION("AddressProtection"),
  
  CITIZENSHIP_RETENTION("CitizenshipRetention"),
  
  RESIDENTIAL_ADDRESS("ResidentialAddress"),
  
  USE_OF_SAMI_LANGUAGE("UseOfSamiLanguage"),
  
  SHARED_RESIDENCE("SharedResidence"),
  
  DEATH("Death"),
  
  FALSE_IDENTITY("FalseIdentity"),
  
  FAMILY_RELATION("FamilyRelation"),
  
  BIRTH("Birth"),
  
  BIRTH_IN_NORWAY("BirthInNorway"),
  
  PARENTAL_RESPONSIBILITY("ParentalResponsibility"),
  
  SAMI_PARLIAMENT_ELECTORAL_REGISTRY_STATUS("SamiParliamentElectoralRegistryStatus"),
  
  NORWEGIAN_IDENTIFICATION_NUMBER("NorwegianIdentificationNumber"),
  
  IDENTITY_VERIFICATION("IdentityVerification"),
  
  IMMIGRATION_TO_NORWAY("ImmigrationToNorway"),
  
  GENDER("Gender"),
  
  RESIDUARY_ESTATE_CONTACT_INFORMATION("ResiduaryEstateContactInformation"),
  
  IDENTIFICATION_DOCUMENT("IdentificationDocument"),
  
  NAME("Name"),
  
  RESIDENCE_PERMIT("ResidencePermit"),
  
  STAY_ON_SVALBARD("StayOnSvalbard"),
  
  PRESENT_ADDRESS("PresentAddress"),
  
  POSTAL_ADDRESS("PostalAddress"),
  
  FOREIGN_POSTAL_ADDRESS("ForeignPostalAddress"),
  
  PREFERRED_CONTACT_ADDRESS("PreferredContactAddress"),
  
  MARITAL_STATUS("MaritalStatus"),
  
  CITIZENSHIP("Citizenship"),
  
  STATUS("Status"),
  
  FOREIGN_PERSON_IDENTIFICATION_NUMBER("ForeignPersonIdentificationNumber"),
  
  EMIGRATION_FROM_NORWAY("EmigrationFromNorway"),
  
  IMMIGRATION_AUTHORITIES_IDENTIFICATION_NUMBER("ImmigrationAuthoritiesIdentificationNumber"),
  
  GUARDIANSHIP_OR_FUTURE_POWER_OF_ATTORNEY("GuardianshipOrFuturePowerOfAttorney"),
  
  DEPRIVED_LEGAL_AUTHORITY("DeprivedLegalAuthority"),
  
  COMMON_CONTACT_REGISTER_INFORMATION("CommonContactRegisterInformation"),
  
  LEGAL_AUTHORITY("LegalAuthority");

  private String value;

  InformationPart(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InformationPart fromValue(String value) {
    for (InformationPart b : InformationPart.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<InformationPart> {
    @Override
    public void write(final JsonWriter jsonWriter, final InformationPart enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InformationPart read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InformationPart.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    InformationPart.fromValue(value);
  }
}
