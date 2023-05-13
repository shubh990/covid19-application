
package com.covid19.model;

import java.sql.Date;
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

})
@Generated("jsonschema2pojo")
public class Covid19Stat implements Comparable<Covid19Stat> {

	@JsonProperty("country")
	public String country;

	@JsonProperty("recovered")
	public int recovered;

	@JsonProperty("province")
	public String province;

	@JsonProperty("city")
	public String city;

	@JsonProperty("keyId")
	public String keyId;

	@JsonProperty("confirmed")
	public int confirmed;

	@JsonProperty("deaths")
	public int deaths;

	@JsonProperty("lastUpdate")
	public Date lastUpdate;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getRecovered() {
		return recovered;
	}

	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getKeyId() {
		return keyId;
	}

	public void setKeyId(String keyId) {
		this.keyId = keyId;
	}

	public int getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
		return "Covid19Stat [country=" + country + ", recovered=" + recovered + ", province=" + province + ", city="
				+ city + ", keyId=" + keyId + ", confirmed=" + confirmed + ", deaths=" + deaths + ", lastUpdate="
				+ lastUpdate + ", additionalProperties=" + additionalProperties + "]";
	}

	@Override
	public int compareTo(Covid19Stat covid19Stat) {

		if (confirmed == covid19Stat.confirmed)
			return 0;
		else if (confirmed > covid19Stat.confirmed)
			return -1;
		else if (confirmed < covid19Stat.confirmed)
			return 1;

		return 0;
	}

}
