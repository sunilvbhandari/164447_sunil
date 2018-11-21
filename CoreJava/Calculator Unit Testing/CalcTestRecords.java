package Example;

public class CalcTestRecords {
	double num1, num2, answer;
	char c;

	public CalcTestRecords(double num1, double num2, char c, double answer) {
		this.num1 = num1;
		this.num2 = num2;
		this.answer = answer;
		this.c = c;
	}

	public char getC() {
		return c;
	}

	public double getAnswer() {
		return answer;
	}

	public double getNum1() {
		return num1;
	}

	public double getNum2() {
		return num2;
	}

}
