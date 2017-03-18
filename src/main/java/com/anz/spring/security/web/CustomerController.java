package com.anz.spring.security.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	
	@RequestMapping(value = "/customers/{UserName}", method = RequestMethod.GET)
	public String sayHelloToCustomer(@PathVariable(value="UserName") final String userName) {
		return "Hello " + userName + "!!!";
	}
	
	@RequestMapping(value = "/customers/name/{customerNumber}")
	public String getCustomerName(@PathVariable(value="customerNumber") final int accountNumber) {
		return "Customer Names: " + accountNumber;
	}
	
	
	@RequestMapping(value = "/customers/ssn/{customerNumber}")
	public String getCustomerSsn(@PathVariable(value="customerNumber") final int customerNumber) {
		return "SSN number for Customer " + customerNumber + " is: " + "123-765-6505";
	}
	
	
}
