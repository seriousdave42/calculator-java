package home.dwatkins;

public class Calculator implements java.io.Serializable {
	private double operandOne;
	private double operandTwo;
	private String operationOne;
	private String operationTwo;
	private double results;
	
	Calculator() {
		this.setOperandOne(0);
		this.setOperandTwo(0);
		this.setOperationOne("");
		this.setOperationTwo("");
		this.setResults(0);
	}
	
	public void performOperation(double operand) {
		if (this.operationOne == "") {
			this.operandOne = operand;
		}
		else if (this.operationOne == "*") {
			this.operandOne *= operand;
			this.operationOne = "";
		}
		else if (this.operationOne == "/") {
			this.operandOne /= operand;
			this.operationOne = "";
		}
		else if (this.operationTwo == "") {
			this.operandTwo = operand;
		}
		else if (this.operationTwo == "*") {
			this.operandTwo *= operand;
			this.operationTwo = "";
		}
		else if (this.operationTwo == "/") {
			this.operandTwo /= operand;
			this.operationTwo = "";
		}
		else {
			if (this.operationOne == "+") {
				this.operandOne += this.operandTwo;
				this.operandTwo = operand;
				this.operationOne = this.operationTwo;
				this.operationTwo = "";
			}
			else {
				this.operandOne -= this.operandTwo;
				this.operandTwo = operand;
				this.operationOne = this.operationTwo;
				this.operationTwo = "";				
			}
		}
	}
	
	public void performOperation(String operation) {
		if (operation == "=") {
			if (this.operationOne == "+") {
				this.results = this.operandOne + this.operandTwo;
			}
			else if (this.operationOne == "-") {
				this.results = this.operandOne - this.operandTwo;
			}
			else {
				this.results = this.operandOne;
			}
		}
		else if (this.operationOne == "") {
			this.operationOne = operation;
		}
		else {
			this.operationTwo = operation;
		}
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
	
	public double getResults() {
		return results;
	}

	public void setResults(double results) {
		this.results = results;
	}
	
	public String getOperationOne() {
		return operationOne;
	}

	public void setOperationOne(String operationOne) {
		this.operationOne = operationOne;
	}

	public String getOperationTwo() {
		return operationTwo;
	}

	public void setOperationTwo(String operationTwo) {
		this.operationTwo = operationTwo;
	}
}
