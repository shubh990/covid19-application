
package com.covid19.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "error",
    "statusCode",
    "message",
    "data"
})
@Generated("jsonschema2pojo")
@Component
public class TotalCountryData {

    @JsonProperty("error")
    private Boolean error;
    @JsonProperty("statusCode")
    private Integer statusCode;
    @JsonProperty("message")
    private String message;
    @JsonProperty("data")
    private CountryData countryData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    @JsonProperty("error")
    public Boolean getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(Boolean error) {
        this.error = error;
    }

    @JsonProperty("statusCode")
    public Integer getStatusCode() {
        return statusCode;
    }

    @JsonProperty("statusCode")
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("data")
    public CountryData getData() {
        return countryData;
    }

    @JsonProperty("data")
    public void setData(CountryData countryData) {
        this.countryData = countryData;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "TotalCountryData [error=" + error + ", statusCode=" + statusCode + ", message=" + message
				+ ", countryData=" + countryData + ", additionalProperties=" + additionalProperties + "]";
	}

}
