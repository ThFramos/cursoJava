package applicationEx02;

import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class programExe02 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		employee employee= new employee();
		
		System.out.print("Nome: ");
		employee.name= sc.nextLine();
		
		System.out.print("Gross Salary: ");
		employee.grossSalary= sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax= sc.nextDouble();
		
		System.out.print("Employee: "+employee.name + ", $ " + employee.netSalary());
		System.out.println("");
		
		System.out.print("Which percentage to increase salary: ");
		double percentage= sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.print("Update data:" +employee.toString());
		sc.close();
		
	}

}
