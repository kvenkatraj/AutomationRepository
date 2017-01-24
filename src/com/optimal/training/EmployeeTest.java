package com.optimal.training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeTest {
	
	
	public static void main(String[] args){
		
		System.out.println("hello world");
		
		Employee emp1 = new Employee(1,"Venkat", "Raju","Manager");		
		
		Employee emp2 = new Employee(1,"Nishanth", "Sunkara", "Developer");	
		
		Employee emp3 = new Employee(1,"Santosh", "Kumar", "Admin");
				
		//emp1.printPosition();
		//emp2.printPosition();
		//emp3.printPosition();		
		//Employee.printPosition();
		
		emp1.printAddress();
			
		
		//emp1.printFullName();
		
		//emp2.printFullName();
		
		//emp3.printFullName();
				
		
							  
		int[] ids = new int[]{10,15,20,30,40};
		
		
		
		for (int i = 0; i < ids.length; i++) {
			
			//System.out.println(ids[i]);
			
			
		}
		
		
		Employee[] employees = new Employee[]{emp1, emp2, emp3};		
		
		
		String[] names = new String[]{"venkat", "sadf"};
		
		
		List<String> employeesList = new ArrayList<String>();
		
		employeesList.add("Venkat");  //0
		employeesList.add("Nikith"); //1
		employeesList.add("sunkara");//2		
		employeesList.add("Venkat");//3
		
		System.out.println(employeesList.size());
		
		for (String string : employeesList) {
			System.out.println(string);
		}
		
			
		
		Set<String> namesSet = new HashSet<String>();		
		
		
		namesSet.add("Venkat");  
		namesSet.add("Nikith"); 
		namesSet.add("sunkara");		
		namesSet.add("Venkat");
		
		System.out.println(namesSet.size());
		
		for (String name : namesSet) {
			
			System.out.println(name);
		}
		
		Iterator<String> iterator = namesSet.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}	
		
		 
		
		Map<Integer, String>  namesMap = new HashMap<Integer,String>();
		
		namesMap.put(1, "Venkat");
		namesMap.put(2, "asdfsdf");
		namesMap.put(3, "asdfsdf");
		namesMap.put(4, "xxxxxxxxxxxx");
		
		
		String name = namesMap.get(1);
		System.out.println(name);
		
		name = namesMap.get(2);
		System.out.println(name);
		
		Set<Integer> keySet = namesMap.keySet();
		
		for (Integer key : keySet) {			
			System.out.println(namesMap.get(key));
		}
		
		Collection<String> values = namesMap.values();
		
		for (String name1 : values) {
			System.out.println(name1);
		}	
			
		
	}
	

}
