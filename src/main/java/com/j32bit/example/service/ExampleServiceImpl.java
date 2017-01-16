package com.j32bit.example.service;

import org.apache.log4j.Logger;

import com.j32bit.example.service.example.GetFullNameRequest;
import com.j32bit.example.service.example.GetFullNameResponse;

public class ExampleServiceImpl implements IExampleService {
	
	Logger logger = Logger.getLogger(ExampleServiceImpl.class);

	@Override
	public GetFullNameResponse getFullName(GetFullNameRequest getFullNameRequest) {

		GetFullNameResponse response = new GetFullNameResponse();
		
		String fullName = getFullNameRequest.getName() +  " " + getFullNameRequest.getSurname();
		
		logger.info(fullName);
		response.setFullName(fullName);
		return response;
	}
}
