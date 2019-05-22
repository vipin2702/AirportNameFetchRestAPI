package com.etc;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ServerStartUpServices implements ApplicationListener<ApplicationReadyEvent>{
	
	@Autowired
	AirportFetchService afs;
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		System.out.println("start up service working");
		try {
			afs.loadAirportData();
		} catch (IOException e) {
			System.out.println("Data could not be loaded");
		}
	}
	
}
