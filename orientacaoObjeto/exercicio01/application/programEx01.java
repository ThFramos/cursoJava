package application;

import java.util.Locale;
import java.util.Scanner;
import entities.rectangle;

public class programEx01 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		rectangle rectangle = new rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.widht= sc.nextDouble();
		rectangle.height= sc.nextDouble();
		
		System.out.printf("AREA:%.2f%n", rectangle.area());
		System.out.printf("PERIMETER:%.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL: %.2f%n",rectangle.diagonal());
		sc.close();
	}

}
