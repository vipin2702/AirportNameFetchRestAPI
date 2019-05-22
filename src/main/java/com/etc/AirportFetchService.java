package com.etc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirportFetchService {

	@Autowired
	DataRepository dr;

	public Optional<FileJB> airportname(String latitude, String longitude) {
		
		return dr.findById(latitude);
		

	}

	public void loadAirportData() throws IOException {

		File file = new File("src/main/resources/jb.csv");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String line;

		while ((line = br.readLine()) != null) {

			String dataArray[] = line.split(",");

			FileJB fileJB = new FileJB();
			fileJB.setAirport_code(dataArray[0]);
			fileJB.setAirport_name(dataArray[1]);
			fileJB.setCity(dataArray[2]);
			fileJB.setState(dataArray[3]);
			fileJB.setCountrycode(dataArray[4]);
			fileJB.setLatitude(dataArray[5]);
			fileJB.setLongitude(dataArray[6]);

			dr.save(fileJB);

		}
		br.close();

	}

}
