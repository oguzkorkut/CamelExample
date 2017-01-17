package com.j32bit.example.service;

import org.apache.log4j.Logger;

import com.j32bit.example.service.example.GetFullNameRequest;
import com.j32bit.example.service.example.GetFullNameResponse;
import com.j32bit.example.service.example.NewOrderRequest;
import com.j32bit.example.service.example.NewOrderResponse;

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

	@Override
	public NewOrderResponse newOrder(NewOrderRequest newOrderRequest) {
		NewOrderResponse newOrderResponse = new NewOrderResponse();
		
		newOrderResponse.setResult(true);
		return newOrderResponse;
	}
}
