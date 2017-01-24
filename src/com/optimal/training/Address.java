package com.optimal.training;

public abstract class Address {
	
	protected String streetName;
	
	protected String city;
	
	protected String state;
	
	protected String zipCode;
	
	//let me test

	public Address(String streetName, String city, String state, String zipCode) {		
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}	
	
	protected  void  printAddress(){
		System.out.println(streetName.concat(city).concat(state).concat(zipCode) );		
		
	}
	
	public abstract void findAddress();
	

}
