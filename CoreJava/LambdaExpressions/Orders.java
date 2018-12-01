package com.lambda.assignment;

import java.util.ArrayList;

public class Orders {

	public static void main(String[] args) {
		ArrayList<Order> list = new ArrayList<Order>();
		list.add(new Order("ab", 15500, true));
		list.add(new Order("cd", 12500, true));
		list.add(new Order("ef", 2600, true));
		list.add(new Order("gh", 2800, false));
		list.forEach((l) -> {
			if (l.getPrice() > 10000 && l.getisAccept() == true) {
				System.out.println(l);
			}
		});

	}
}
