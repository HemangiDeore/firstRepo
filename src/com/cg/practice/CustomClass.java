package com.cg.practice;



public class CustomClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("This is custom class");
		
		Employee emp = new Employee(); //Instantiating new class object
		emp.name = "Hemangi";
		emp.empid = 123;
		emp.salary = 54000f;
		
		Employee emp2 = new Employee();
		emp2.name = "Deore";
		emp2.empid = 1999;
		emp2.salary = 3500f;
		 
		
		//System.out.println(emp.name);
		//System.out.println(emp.empid);
		//System.out.println(emp.salary);
		
		
		emp.printdetails();   //we can call as many as times we want hence methods are used 
		emp.printdetails();
		
		emp2.printdetails();
		float salary = emp2.getsalary();
		System.out.println(salary);
		
	
		
		

	}

}
