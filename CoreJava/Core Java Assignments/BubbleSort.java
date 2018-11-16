package com.sunil.ds;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		int num[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		
		
		for (int i = 0; i <14; i++) {
			for (int j = 0; j <14; j++) {
				int temp;
				if(num[j]>num[j+1]){
					temp=num[j];
					num[j]=num[j+1];
							num[j+1]=temp;
				}
			}
		}
			for(int k=0;k<15;k++)
		{
			System.out.println(num[k]);
		}
	}
	}
