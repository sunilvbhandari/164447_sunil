package com.sunil.date;

import com.sunil.date.support.MyDate;

public class DateDifferenceProvider {
	int[] month = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
	public int getDate(MyDate startDate, MyDate endDate) {

		if (endDate.getDd() == startDate.getDd()
				&& endDate.getMm() == startDate.getMm()
				&& endDate.getYyyy() == startDate.getYyyy()) {
			return 0;
		} else if (endDate.getMm() == startDate.getMm()
				&& endDate.getYyyy() == startDate.getYyyy()) {
			return endDate.getDd() - startDate.getDd();
		} else if (endDate.getYyyy() == startDate.getYyyy())
			return remainingDaysOfMonth(startDate, startDate.getDd())
					+ endDate.getDd() + month[startDate.getDd()];
		else
			return remainingDaysOfMonth(startDate, startDate.getDd())+remainingdaysofyear(startDate)+completedDaysOfYear(endDate)+endDate.getDd()+leapyear(startDate.getYyyy(),endDate.getYyyy());
	}

	private int leapyear(int yyyy, int yyyy2) {
		
			int count=0;
			for(int in=yyyy;in<=yyyy2;in++){
				 if(in%4==0){
					count++;
				 }
			}
			System.out.println(count);return count;
		}

	private int completedDaysOfYear(MyDate endDate) {
		int daysc=0;
		for(int in=1;in<endDate.getMm();in++){
			 daysc+=month[in];
		}
		System.out.println("C:"+daysc);
		return daysc;
	}
	

	private int remainingDaysOfMonth(MyDate startDate, int i) {

		return month[i] - startDate.getDd();
	}
	
	private int remainingdaysofyear(MyDate startDate) {
		int daysr=0;
		for(int in=startDate.getMm()+1;in<13;in++){
			 daysr+=month[in];
		}
		System.out.println("R:"+daysr);
		return daysr;
	}


	
	}

