package com.covid19.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.covid19.model.Coviddata;
import com.covid19.model.TotalCountryData;

import java.net.URI;

@Service
public class ServiceClass {

	@Autowired
	private RestTemplate restTemplate;

	String urlname;
	String covidUrl;
	String apiKeyName = "x-rapidapi-key";
	String apiKeyValue = "79ffb8ddc1mshbfcb0728eed6ebbp183070jsne39fc685d1e6";
	String hostName = "x-rapidapi-host";
	String hostValue = "covid-19-coronavirus-statistics.p.rapidapi.com";

	public String getUrlname() {
		return urlname;
	}

	public void setUrlname(String urlname) {
		this.urlname = urlname;
	}
	
	public TotalCountryData totalCountryData() {
		TotalCountryData totalCountryDataobj = null;
		covidUrl = "https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/total?country=" + this.urlname;
		try {

			URI uri = new URI(covidUrl);
			HttpHeaders headers = new HttpHeaders();
			headers.set(apiKeyName, apiKeyValue);
			headers.set(hostName, hostValue);
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			HttpEntity<String> request = new HttpEntity<String>(headers);
			ResponseEntity<TotalCountryData> totalEntity = restTemplate.exchange(uri, HttpMethod.GET, request,
					TotalCountryData.class);
			totalCountryDataobj = totalEntity.getBody();
			return totalCountryDataobj;

		} catch (Exception e) {
			System.out.println(e);
			return totalCountryDataobj;
		}
	}

	public Coviddata Totals() {
		Coviddata coviddata = null;
		covidUrl = "https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats?country=" + this.urlname;
		try {

			URI uri = new URI(covidUrl);
			HttpHeaders headers = new HttpHeaders();
			headers.set(apiKeyName, apiKeyValue);
			headers.set(hostName, hostValue);
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			HttpEntity<String> request = new HttpEntity<String>(headers);
			ResponseEntity<Coviddata> totalEntity = restTemplate.exchange(uri, HttpMethod.GET, request,
					Coviddata.class);
			coviddata = totalEntity.getBody();
			return coviddata;

		} catch (Exception e) {
			System.out.println(e);
			return coviddata;
		}
	}

	
}
