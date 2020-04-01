package entities;

public class employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double percentage;
public double netSalary() {
	
	return grossSalary - tax;
}

public void increaseSalary (double percentage) {
	this.percentage= (grossSalary-tax) + grossSalary * percentage/100;
	
	
}

public String toString() {
	return name+", $"+ this.percentage;
}
}
