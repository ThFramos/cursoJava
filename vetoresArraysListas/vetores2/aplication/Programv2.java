package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.product;

public class Programv2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int n= sc.nextInt();
		product[] vect =new product[n];
		
		for (int i=0; i<vect.length;i++) {
			sc.nextLine();
			String name= sc.nextLine();
			double price = sc.nextDouble();
			vect[i]= new product(name,price);
			
			
		}
		double sum =0;
		
		for (int i=0;i<vect.length;i++) {
			sum += vect[i].getPrice();
			
			
		}
		double avg = sum/vect.length;
		System.out.printf("Averege Price= %.2f%n",avg);
	
	sc.close();
	}

}