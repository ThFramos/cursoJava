package com.atividade1;
import java.util.Scanner;
public class atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anos, meses, dias, total;
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Você deverá digitar sua idade contendo a quantidade de anos, meses e dias. Ex: 22 anos, 3 meses e 21 dias");
		
		System.out.println("Digite quantos anos você tem");
		anos = entrada.nextInt();
		
		System.out.println("Digite quantos meses sobraram");
		meses = entrada.nextInt();
		
		System.out.println("Digite quantos dias sobraram");
		dias = entrada.nextInt();
		
		total= (anos*365)+(meses*30)+dias;
		
		System.out.println("Você possui:"+ total + " dias de vida");
		
	}

}
