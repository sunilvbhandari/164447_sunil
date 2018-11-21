package com.sunil.date.record;

import com.sunil.date.support.MyDate;

public class MyTestRecords {
	public MyDate startDate;
	public MyDate endDate;
	public int difference;

	public MyTestRecords(MyDate startDate, MyDate endDate, int i) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.difference = i;
	}

	public MyDate getStartDate() {
		return startDate;
	}

	public MyDate getEndDate() {
		return endDate;
	}

	public int getDifference() {
		return difference;
	}
}
