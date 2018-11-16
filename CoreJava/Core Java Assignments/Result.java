package com.sunil.ds;

import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("enter marks1:");
		 int marks1 = scan.nextInt();
		 System.out.println("enter marks2:");
		double marks2 = scan.nextDouble();
		 System.out.println("enter marks3:");
		 double marks3= scan.nextDouble();
		 int count=0;
		 if(marks1>=60){
			 count++;
			if(marks2>=60)
			{
				 count++;
			if(marks3>=60)
			{ count++;}
			}
		 }
		 System.out.println(count);
		 if(count==3)
		 {System.out.println("Passed");}
		 
		 else if(count==2)
		 {System.out.println("Promoted");}
		 else
		 {System.out.println("Fail");}
		 
	}

}
