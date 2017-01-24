package com.optimal.training;

public class Employee extends Address {
	
	private int id;
	private String firstName;
	private String lastName;
	
	private static String position;
	
	private static final String dept = "Software";
	
	
	public Employee(int id, String firstName, String lastName, String position) {
		super("fsdsdf","sdfsdaf","sadfsdafs","asdfsdaf");
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		
	}	
	
	
	public void printFullName(String mName){
		
		String name = firstName+","+mName+lastName;
	}
	
	public void printFullName(int id){
		
		String name = firstName+","+id+lastName;
	}

	public   void  printFullName(){
		
		//String str1 = firstName.concat(",");
		
		//String name = str1.concat(lastName);
		
		String name = firstName+","+lastName;
		
		System.out.println(id);
		System.out.println(name);		
		
	}
	
	public static void printPosition(){
		
		System.out.println(position);
	}
	
			
	
	
	protected void  printAddress(){
		super.printAddress();
		System.out.println(firstName+","+lastName);		
		
	}
	
	public  void findAddress(){
		//do something here
	}
	
		
	
	
	

}
