package com.app.primeiroprograma;
import java.util.Scanner;
//import java.util.Calendar;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;

import java.util.Date;
public class PrimeiroPrograma {

	public static void main(String[] args) { //void = metodo
		
		  Scanner entrada = new Scanner(System.in);
		  int ano_atual;
		  int ano_nascimento;
		  
		  String nome;
		  String nome1;
		  boolean nome_compare;
		  int idade;
		  
		  
	        Date data= new Date();
	      
	     
		  
		  
		System.out.println("digite sua idade");
		idade= entrada.nextInt();
		
		System.out.println("digite seu nome");
		nome= entrada.next();
		
		System.out.println("Paciente: "+nome+"\n"+"idade: "+idade+" anos");
		
	//	System.out.println("data: "+ data);
		nome1="thiago";
		nome_compare= nome1 == nome;
		if(nome1.equals(nome)) {

			System.out.println("verdadeiro");
		}else {
			System.out.println("falso" + data);
		}
	}

}
