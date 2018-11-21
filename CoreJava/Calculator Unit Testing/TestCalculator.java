package Example;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		CalcTestRecords testRecords[] = new CalcTestRecords[7];
		testRecords[0] = new CalcTestRecords(4, 6, '+', 10);
		testRecords[1] = new CalcTestRecords(4, 6, '-', -2);
		testRecords[2] = new CalcTestRecords(4, 6, '+', 10);
		testRecords[3] = new CalcTestRecords(4, 6, '*', 24);
		testRecords[4] = new CalcTestRecords(4, 6, '+', 10);
		testRecords[5] = new CalcTestRecords(6, 4, '/', 1.5);
		testRecords[6] = new CalcTestRecords(4, 6, '-', -2);

		for (int i = 0; i < testRecords.length; i++) {
			double expectedAnswer = calculator.equal(testRecords[i].getNum1(), testRecords[i].getNum2(),
					testRecords[i].getC());
			System.out.println("Expected Answer:" + expectedAnswer);
			if (testRecords[i].getAnswer() == calculator.getAns()) {
				System.out.println("pass");
			} else
				System.out.println("fail");

		}
	}
}
