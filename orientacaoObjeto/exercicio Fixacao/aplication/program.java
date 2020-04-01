package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class program {
	
	

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("What is the dollar price?");
			double dP= sc.nextDouble();
		System.out.println("How many dollars wil be bought?");
			double dB = sc.nextDouble();
			
			double reais = CurrencyConverter.reais(dB, dP);
	
		System.out.printf("Amount to be  paid in reais=R$ %.2f%n ", reais);

	}

}
