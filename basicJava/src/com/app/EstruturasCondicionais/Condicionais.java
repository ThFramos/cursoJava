 package com.app.EstruturasCondicionais;

public class Condicionais {

	public static void main(String[] args) {
		int nota1, nota2, nota3,nota4, media;
		
		boolean resultado;
		
		nota1=0;
		nota2=4;
		nota3=3;
		nota4=7;
		media = (nota1+nota2+nota3+nota4)/4;
		
		if(resultado= media <5) {
			
			System.out.println("reprovado");
			System.out.println("média= " + media);
		}
		else if(resultado= media>=5&&media<8) {
			System.out.println("Aprovado");
			System.out.println("média= " + media);
		}else if(resultado= media>=8) {
			System.out.println("Aprovado com excelencia");
			System.out.println("média= " + media);
		}

	}

}
