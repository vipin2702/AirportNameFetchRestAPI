package com.etc;

import org.springframework.data.repository.CrudRepository;

public interface  DataRepository extends CrudRepository<FileJB,String> {

	
	public FileJB findByLatitudeAndLongitude(String latitude, String longitude);
	
}
