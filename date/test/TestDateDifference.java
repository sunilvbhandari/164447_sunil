package com.sunil.date.test;

import com.sunil.date.DateDifferenceProvider;
import com.sunil.date.record.MyTestRecords;
import com.sunil.date.support.MyDate;

public class TestDateDifference {

	public static void main(String[] args) {
		DateDifferenceProvider provider = new DateDifferenceProvider();
		MyTestRecords[] MyTestRecords = new MyTestRecords[4];

		MyTestRecords[0] = new MyTestRecords(new MyDate(12, 5, 1996),new MyDate(12, 5, 1996), 0);
		MyTestRecords[1] = new MyTestRecords(new MyDate(12, 12, 1996),new MyDate(16, 12, 1996), 4);
		MyTestRecords[2] = new MyTestRecords(new MyDate(12, 4, 1996),new MyDate(16, 7, 1996), 66);
		MyTestRecords[3] = new MyTestRecords(new MyDate(4,6,2011),new MyDate(18,12,2012), 563);

		
		for (int index = 0; index < MyTestRecords.length; index++) {
			int calculatedDiff = provider.getDate(
					MyTestRecords[index].getStartDate(),
					MyTestRecords[index].getEndDate());
			System.out.println(calculatedDiff);
			//System.out.println(MyTestRecords[index].getDifference());
			if (MyTestRecords[index].getDifference() == calculatedDiff) {
				System.out.println("pass");
			} else {
				System.out.println("fail");
			}
		}
	}
}
