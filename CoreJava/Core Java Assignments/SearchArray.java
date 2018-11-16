
package com.sunil.ds;

import java.util.Scanner;

public class SearchArray {
public static void main(String[] args) {

	 Scanner scan = new Scanner(System.in);
	int num[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	System.out.println("enter the number to be searched");
	 int searchnumber=scan.nextInt();
	 int i=0;
	while( i<15){
		if(searchnumber==num[i])
		{
			System.out.println("Found");
		break;}
	i++;		
	}
	if(i>=15)
	System.out.println("not found");
	}
}
