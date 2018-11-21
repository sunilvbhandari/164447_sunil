package Example;

public class Calculator {
	double result;

	double equal(double num1, double num2, char c) {
		switch (c) {
		case '+':
			add(num1, num2);
			break;
		case '-':
			sub(num1, num2);
			break;
		case '*':
			mul(num1, num2);
			break;
		case '/':
			div(num1, num2);
			break;
		default:
			System.out.println("invalid");
		}
		return result;

	}

	double add(double num1, double num2) {
		result = num1 + num2;
		System.out.println("Answer:" + result);
		return result;

	}

	double sub(double num1, double num2) {
		result = num1 - num2;
		System.out.println("Answer:" + result);
		return result;
	}

	double mul(double num1, double num2) {
		result = num1 * num2;
		System.out.println("Answer:" + result);
		return result;

	}

	double div(double num1, double num2) {
		result = num1 / num2;
		System.out.println("Answer:" + result);
		return result;
	}

	public double getAns() {

		return result;
	}
}
