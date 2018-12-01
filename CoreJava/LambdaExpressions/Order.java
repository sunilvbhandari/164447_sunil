package com.lambda.assignment;

public class Order {
	String name;
	double price;
	boolean isAccept;

	public Order(String name, double price, boolean isAccept) {
		super();
		this.name = name;
		this.price = price;
		this.isAccept = isAccept;

	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public boolean getisAccept() {
		return isAccept;
	}

	@Override
	public String toString() {

		return "Name: " + name + "    price: " + price + "   isAccepted: "
				+ isAccept;

	}

}
