package com.app.exercio08;
import java.util.Scanner;
public class exerciocio08 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		

		double salario, imposto, montante1,montante2,montante3,montante4;
		montante1=0;
		montante2=0;
		montante3=0;
		montante4=0;
		System.out.println("Digite o valor do salário");
		salario= sc.nextFloat();
		
		if (salario<2000) {	montante1=(salario -2000);System.out.println("Valor Isento de imposto = " + montante1);}
		else { System.out.println("Valor Isento de imposto = 2000");}
			
		
		
		
		if (salario>2000) {
			if(salario<3000){
				montante2=(salario -2000)*0.08;}else { montante2=1000*0.08;}
			System.out.println("Imposto sobre 8% = " + montante2);}
				
		
		if (salario>3000) {
			if (salario<4500) {
				montante3= (salario-3000)*.18;}else {montante3=1500*0.18;}
			System.out.println("Imposto sobre 18% = " + montante3);}
			
		if (salario>4500) {montante4= (salario-4500)*.28;
		System.out.println("Imposto sobre 28% = " + montante4);}
		
		imposto= (montante2+montante3+montante4);
		System.out.println("Total de impostos à cobrar= " + imposto);
		
		
		}
			
			
		/*	
			
		if (salario>2000 && salario <3000) {
			 if ((salario-2000)<1000) {
				 montante2=(salario-2000)*.08;}else {montante2=1000*.08;}}
		  
		  if (salario>3000 && salario <4500) { 
			  if ((salario-3000)<1500) {
					 montante3=(salario-3000)*.18;}else {montante3=1500*.18;}}
		  
		  if (salario>4500) {
			  montante4= (salario-4500)*.28;}

		imposto= (montante1+montante2+montante3);
		System.out.println("Total do valor isento= " + montante1);
		System.out.println("Total do imposto sobre 8%= " + montante2);
		System.out.println("Total do imposto sobre 18%= " + montante3);
		System.out.println("Total do imposto sobre 28%= " + montante4);
		System.out.println("Total de impostos à cobrar= " + imposto);
		*/
	
	
	}


