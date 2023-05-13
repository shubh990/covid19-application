package com.covid19.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covid19.model.CountryData;
import com.covid19.model.Covid19Stat;
import com.covid19.model.Coviddata;
import com.covid19.model.TotalCountryData;
import com.covid19.service.ServiceClass;

import java.util.*;

@Controller
public class Controllers {

	@Autowired
	ServiceClass serviceClass;
	
	Coviddata coviddata;

	TotalCountryData totalCountryData;

	List<Covid19Stat> stats;
	
	CountryData countryData;
	
	String country;

	@GetMapping("/")
	public String home() {
//		coviddata = serviceClass.Totals();
//		List<Covid19Stat> stats = coviddata.getData().getCovid19Stats();
//		stats.get(0);
//		System.out.println(stats.get(12).getProvince());
		return "covid19";
	}

	@RequestMapping("/country")
	public String country(@RequestParam("country") String country, Model model) {

		serviceClass.setUrlname(country);
		this.country = country;
		
		try {
			coviddata = serviceClass.Totals();
			totalCountryData = serviceClass.totalCountryData();
			stats = coviddata.getData().getCovid19Stats();
			countryData = totalCountryData.getData();
		} catch (Exception e) {
			model.addAttribute("invalid", "Something went Wrong! Please Enter Valid Country Name! ");
			return "covid19";
		}

		if (stats.size() > 3000) {
			model.addAttribute("invalid", "Please Enter Valid Country Name!!");
			return "covid19";
		} else {
			model.addAttribute("stats", stats);
			model.addAttribute("total", countryData);
			model.addAttribute("country", country);
			return "covid19";
		}
	}

	@GetMapping("/confirmed")
	public String confirmed(Model model) {
		stats.sort((Covid19Stat o2, Covid19Stat o1) -> o1.getConfirmed() - o2.getConfirmed());

		model.addAttribute("stats", stats);
		model.addAttribute("total", countryData);
		model.addAttribute("country", country);
		return "covid19";
	}
	
	@GetMapping("/active")
	public String active(Model model) {
		stats.sort((Covid19Stat o2, Covid19Stat o1) -> (o1.getConfirmed() - o1.getRecovered()) - (o2.getConfirmed() - o2.getRecovered()));

		model.addAttribute("stats", stats);
		model.addAttribute("total", countryData);
		model.addAttribute("country", country);
		return "covid19";
	}

	@GetMapping("/recovered")
	public String recovered(Model model) {

		stats.sort((Covid19Stat o2, Covid19Stat o1) -> o1.getRecovered() - o2.getRecovered());

		model.addAttribute("stats", stats);
		model.addAttribute("total", countryData);
		model.addAttribute("country", country);
		return "covid19";
	}

	@GetMapping("/deaths")
	public String deaths(Model model) {

		stats.sort((Covid19Stat o2, Covid19Stat o1) -> o1.getDeaths() - o2.getDeaths());

		model.addAttribute("stats", stats);
		model.addAttribute("total", countryData);
		model.addAttribute("country", country);
		return "covid19";
	}
	//lol
	@GetMapping("/state")
	public String state(Model model) {
		stats.sort((Covid19Stat o2, Covid19Stat o1) -> o2.getProvince().compareToIgnoreCase(o1.getProvince()));

		model.addAttribute("stats", stats);
		model.addAttribute("total", countryData);
		model.addAttribute("country", country);
		return "covid19";
	}
	
	@RequestMapping("/about")
	public String about(){
		return "about";
	}

}
