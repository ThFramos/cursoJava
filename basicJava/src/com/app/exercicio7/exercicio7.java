package com.app.exercicio7;
import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		float x,y;
		String resultado;
		
		System.out.println("Digite o valor do x");
		x= sc.nextFloat();
		

		System.out.println("Digite o valor do y");
		y= sc.nextFloat();
		
		
		if (x>0 && y>0) {
			System.out.println("O ponto de referencia entre x e y esta no quadrante Q1");
			System.out.println("valor do x= "+ x + ";   valor do y= " + y);
		}
		else if (x>0 && y<0) {
			System.out.println("O ponto de referencia entre x e y esta no quadrante Q2");
			System.out.println("valor do x= "+ x + ";   valor do y= " + y);
		}
		else if (x==0 && y!=0) {
			System.out.println("O ponto de referencia está sobre o eixo 'x'");
			System.out.println("valor do x= "+ x + ";   valor do y= " + y);
		}
		else if (x<0 && y<0) {
			System.out.println("O ponto de referencia entre x e y esta no quadrante Q3");
			System.out.println("valor do x= "+ x + ";   valor do y= " + y);
		}
		else if (x<0 && y>0) {
			System.out.println("O ponto de referencia entre x e y esta no quadrante Q4");
			System.out.println("valor do x= "+ x + ";   valor do y= " + y);
		}
		else if (y==0 && x!=0) {
			System.out.println("O ponto de referencia está sobre o eixo 'y'");
			System.out.println("valor do x= "+ x + ";   valor do y= " + y);
		}
		else{
			System.out.println("O ponto de referencia está no ponto '0' de ambos os eixos");
			System.out.println("valor do x= "+ x + ";   valor do y= " + y);
		}
	}

}
