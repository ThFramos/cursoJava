package com.app.exercicios_swtchCase_expressoesCondicionais;
import java.util.Scanner;
public class exercicios {

	public static void main(String[] args) {
				/* Exercicio 02
				 * 
		int x, y;
		Scanner sc= new Scanner(System.in);
		

		System.out.println("Digite um valor");
		x= sc.nextInt();
		
		y=x%2;
		
		  ## If else ##
		  
		if (y==0) {
			System.out.println("Esse n�mero � par!!!");
				  }else {System.out.println("Esse n�mero � impar!!!");	
		}
		
		
		 // ## switch-case ##
		
		 switch(y) {
		case 0:
			System.out.println("Esse n�mero � par!!!");
		    break;
		case 1:
			System.out.println("Esse n�mero � impar!!!");
			break;		
		}
		
		
		
		// ## ExpressoesCondicionais ##
		
		String resultado=(y==0)?"Esse n�mero � par": "Esse n�mero � impar";
		System.out.println(resultado);
		*/
		
		// Exerc�cio03 - multiplos
		
		
		int x,y,z;
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite um valor para X ");
		x= sc.nextInt();
		
		System.out.println("Digite um valor para Y ");
		y= sc.nextInt();
		
		/*
		  // == if else ==
		   *
		if(x>y) {
		z=x%y;	
		}else {z=y%x;}
		
		if(z==0) {
			System.out.println(" X e Y s�o n�meros multiplos.");
		}else {System.out.println(" X e Y N�o s�o n�meros multiplos.");}
		*/
		
		// switch-case
		/*
		if(x>y) {
			z=x%y;	
			}else {z=y%x;}
			
		switch(z){
		case 0:
			System.out.println(" X e Y s�o n�meros multiplos.");
			break;
		case 1:
			System.out.println(" X e Y N�o s�o n�meros multiplos.");
			break;
			
		}*/
		
		//condicionais
		
		z=(x>y)? x%y : y%x;
		String resultado= (z==0)? "S�o m�ltiplos":"N�o s�o m�ltiplos";
		System.out.println(resultado);
		
	}

}
