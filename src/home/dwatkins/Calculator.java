package home.dwatkins;

public class Calculator implements java.io.Serializable {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double results;
	
	Calculator() {
		this.setOperandOne(0);
		this.setOperandTwo(0);
		this.setOperation("+");
		this.setResults(0);
	}

	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getResults() {
		return results;
	}

	public void setResults(double results) {
		this.results = results;
	}
	
	public void performOperation() {
		if (this.operation == "+") {
			this.results = this.operandOne + this.operandTwo;
		}
		else if (this.operation == "-") {
			this.results = this.operandOne - this.operandTwo;
		}
		else {
			System.out.println("Illegal operation");
			this.results = 0;
		}
	}
}
