package com.app.repetidorFor;
import java.util.Scanner;
public class exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor final do intervalo para saber quais são impares");
		int x = sc.nextInt();
		
		for(int y=1;y<=x;y++) {
			
			if(y%2 !=0) {
				System.out.println(y);
			}
			
		}

		
		

	}

}
