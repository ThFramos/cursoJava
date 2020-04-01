package com.app.condicoes;
import java.util.Scanner;
public class switch_case {

	public static void main(String[] args) {
		
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		int x = entrada.nextInt();
				
		/*
		// switch-Case
		 * 
		switch (x) {
		
		case 1:
			System.out.println("positivo");
			break;
		case -1:
			System.out.println("negativo");
			break;
			
		default:
			System.out.println("não encontrado");
			break;
		}
		*/
		
		//Expressão Condicional Ternária
		
		// variavel=(condição)? resultado se verdadeira: resultado se falsa;
		
		String resultado=(x>=0)? "positivo":"negativo";
		System.out.println(resultado);
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int z =0;
		String resultado =(x>=z)? "positivo":"negativo";
		System.out.println(resultado);
		*/
		
	}


}
