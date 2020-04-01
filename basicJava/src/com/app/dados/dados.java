package com.app.dados;
import java.util.Scanner;
public class dados {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int dado;
		int valor;
		System.out.println("Digite o valor do dado");
		dado= entrada.nextInt();
		valor= dado%2;
		
		if(valor==1) {
			System.out.println("o número é ímpar");
		}else {
			
			System.out.println("o número é par");
		}
		
		
		

	}

}
