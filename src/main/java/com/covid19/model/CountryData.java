
package com.covid19.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "recovered",
    "deaths",
    "confirmed",
    "lastChecked",
    "lastReported",
    "location"
})
@Generated("jsonschema2pojo")
public class CountryData{

	@JsonProperty("recovered")
    private Integer recovered;
    @JsonProperty("deaths")
    private Integer deaths;
    @JsonProperty("confirmed")
    private Integer confirmed;
    @JsonProperty("lastChecked")
    private Date lastChecked;
    @JsonProperty("lastReported")
    private Date lastReported;
    @JsonProperty("location")
    private String location;

	@JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("recovered")
    public Integer getRecovered() {
        return recovered;
    }

    @JsonProperty("recovered")
    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    @JsonProperty("deaths")
    public Integer getDeaths() {
        return deaths;
    }

    @JsonProperty("deaths")
    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    @JsonProperty("confirmed")
    public Integer getConfirmed() {
        return confirmed;
    }

    @JsonProperty("confirmed")
    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }

    @JsonProperty("lastChecked")
    public Date getLastChecked() {
        return lastChecked;
    }

    @JsonProperty("lastChecked")
    public void setLastChecked(Date lastChecked) {
        this.lastChecked = lastChecked;
    }

    @JsonProperty("lastReported")
    public Date getLastReported() {
        return lastReported;
    }

    @JsonProperty("lastReported")
    public void setLastReported(Date lastReported) {
        this.lastReported = lastReported;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
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
		return "CountryData [recovered=" + recovered + ", deaths=" + deaths + ", confirmed=" + confirmed
				+ ", lastChecked=" + lastChecked + ", lastReported=" + lastReported + ", location=" + location
				+ ", additionalProperties=" + additionalProperties + "]";
	}
    


}
