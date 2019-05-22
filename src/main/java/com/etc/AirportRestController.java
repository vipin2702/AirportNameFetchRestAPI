package com.etc;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AirportRestController {
	
	@Autowired
	AirportFetchService afs;
	
	@RequestMapping("/")
	public String homePage() {
		return "home.jsp";
	}
	
	@ResponseBody
	@RequestMapping("/getAirportName")
	public Optional<FileJB> fetchAirportName(@RequestParam("latitude") String latitude, @RequestParam("longitude") String longitude) throws IOException {

		return afs.airportname(latitude,longitude);
		
	}
	
	
}
