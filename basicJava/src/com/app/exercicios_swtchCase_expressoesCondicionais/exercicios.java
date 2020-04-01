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
			System.out.println("Esse número é par!!!");
				  }else {System.out.println("Esse número é impar!!!");	
		}
		
		
		 // ## switch-case ##
		
		 switch(y) {
		case 0:
			System.out.println("Esse número é par!!!");
		    break;
		case 1:
			System.out.println("Esse número é impar!!!");
			break;		
		}
		
		
		
		// ## ExpressoesCondicionais ##
		
		String resultado=(y==0)?"Esse número é par": "Esse número é impar";
		System.out.println(resultado);
		*/
		
		// Exercício03 - multiplos
		
		
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
			System.out.println(" X e Y são números multiplos.");
		}else {System.out.println(" X e Y Não são números multiplos.");}
		*/
		
		// switch-case
		/*
		if(x>y) {
			z=x%y;	
			}else {z=y%x;}
			
		switch(z){
		case 0:
			System.out.println(" X e Y são números multiplos.");
			break;
		case 1:
			System.out.println(" X e Y Não são números multiplos.");
			break;
			
		}*/
		
		//condicionais
		
		z=(x>y)? x%y : y%x;
		String resultado= (z==0)? "São múltiplos":"Não são múltiplos";
		System.out.println(resultado);
		
	}

}
