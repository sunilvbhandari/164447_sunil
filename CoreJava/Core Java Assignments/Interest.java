package com.sunil.ds;

import java.util.Scanner;

public class Interest {
public static void main(String[] args) {
	
	 Scanner scan = new Scanner(System.in);
	 System.out.println("enter pamount:");
	 int pamount = scan.nextInt();
	 System.out.println("enter time:");
	double time = scan.nextDouble();
	 System.out.println("enter rate:");
	 double rate = scan.nextDouble();
	double SimpleInterest=(pamount*time*rate/100);
	System.out.println(SimpleInterest);
	double CompoundInterest= pamount *time;
	System.out.println(CompoundInterest);
	 }
}
