package com.app.metodos;
	    //metodo � um grupo de c�digo que faz uma determinada opera��o
		//reaproveitamento do c�digo
		// void main m�todo 
public class metodos {

	public static void main(String[] args) {
	
		meuMetodo(); // chamando metodo criado
		multiplicar(2,4); // valores dos parametros
		
		
		int results;
		results = multiplicador(2,8);
		System.out.println(results *2);
	}
	public static void meuMetodo() {
	 
		System.out.println("meu metodo"); //  so sera executado apos ser chamado na main
 }
	public static void multiplicar (int numero1, int numero2) {
		int resultado =0;
		resultado= numero1 * numero2;
		System.out.println(resultado);
	}
	public static int multiplicador (int numeroa, int numerob) { // forma de utilizar os valores
		int results = 0;
		
		results = numeroa * numerob;
		return(results); // sempre ha a necessidade de retornar o valor
	}
}


//void significa vazio, ou seja s� transmiti o metodo n�o devolve resultado
//int numero 1 e 2 s�o parametros, necess�rio sempre passar os valores