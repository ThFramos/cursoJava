package AplicationExerListas;

import java.util.Locale;
import java.util.Scanner;

import EntitiesExerListas.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product employee = new Product();
		
		System.out.println("How many employees will be registered");
		int x = sc.nextInt();
		
		for (int i=0; i<x;i++) {
			
			System.out.println("Emploee # " + (i+1) + " :");
			System.out.println("Id: ");
			 = sc.nextInt();
			
			
		}
		

	}

}
