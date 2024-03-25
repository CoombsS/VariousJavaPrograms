package lec17prob1;


import java.util.Scanner;

class Institute{
	String name = "JBU";
	int estYr = 1884;
	int facCount = 490;
	int staffCount = 250;
	int stuCount = 500;
	int noOfDept = 14;
}

class Department extends Institute{
	String dName = "Engineering";	
	int deptEstYr = 1950;
	int dFacCount = 100;
	int dStaffCount = 85;
	int freshCount = 30;
	int sophCount = 60;
	int jrCount = 30;
	int srCount = 10;
}

public class inheritance extends Department{ //STUDENT CLASS
	String sName = "Skyler";
	int age = 24;
	int regNum = 1243;
	String height = "5'10";
	int weight = 170;
		public static void main(String[] args) {
			inheritance stu = new inheritance();
			System.out.println("Student name is: "+stu.sName);
			System.out.println("Department name is: "+stu.dName);
			System.out.println("Name of the Institute: "+stu.name);
			System.out.println("The year the Institute was est.: "+stu.estYr);
		}
}


