package home.dwatkins;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc1 = new Calculator();
		calc1.performOperation(10);
		calc1.performOperation("+");
		calc1.performOperation(5);
		calc1.performOperation("*");
		calc1.performOperation(10);
		calc1.performOperation("-");
		calc1.performOperation(10);
		calc1.performOperation("/");
		calc1.performOperation(2);
		calc1.performOperation("=");
		System.out.println(calc1.getResults());
	}

}
