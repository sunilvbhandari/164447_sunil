package com.lambda.assignment;

public class ArithmaticOperations {
	public static void main(String[] args) {

		myType addLambda = (a, b) -> {
			System.out.println("add:" + (a + b));
			System.out.println("sub:" + (a - b));
			System.out.println("mul:" + (a * b));
			System.out.println("div:" + (a / b));
		};
		addLambda.perform(10, 20);
	}

	interface myType {
		void perform(double num1, double num2);
	}
}
