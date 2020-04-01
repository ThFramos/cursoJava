package com.app.OperadoresRelacionaisLogico;

public class OperadoresRelacionaisLogico {

	//Operadores
	
	// Relacionais
	
	// == (igual);    obs.: (=) atribui determinado valor;
	// != (diferente);
	// >  (maior);
	// <  (menor);
	// >= (maior ou igual);
	// <= (menor ou igual);
	
	//Lógicos
	
	// && (e);
	// || (ou);
	
	
	public static void main(String[] args) {
		// Igual
		
		boolean resultadoIgual;
			
		int aIgual=6;
		int bIgual=6;
		resultadoIgual= aIgual==bIgual;
				
		System.out.println(resultadoIgual);

		// Diferente
		
				boolean resultadoDiferente;
					
				int aDiferente=6;
				int bDiferente=6;
				resultadoDiferente= aDiferente!=bDiferente;
						
				System.out.println(resultadoDiferente);
		
				
				// Maior que
				
				boolean resultadoMaiorQue;
					
				int aMaiorQue=6;
				int bMaiorQue=6;
				resultadoMaiorQue= aMaiorQue > bMaiorQue;
						
				System.out.println(resultadoMaiorQue);
				
				// Menor que
				
				boolean resultadoMenorQue;
					
				int aMenorQue=6;
				int bMenorQue=6;
				resultadoMenorQue= aMenorQue < bMenorQue;
						
				System.out.println(resultadoMenorQue);
				
// Maior ou Igual
				
				boolean resultadoMaiorOuIgual;
					
				int aMaiorOuIgual=6;
				int bMaiorOuIgual=6;
				resultadoMaiorOuIgual= aMaiorOuIgual >= bMaiorOuIgual;
						
				System.out.println(resultadoMaiorOuIgual);
				
// Menor ou Igual
				
				boolean resultadoMenorOuIgual;
					
				int aMenorOuIgual=6;
				int bMenorOuIgual=6;
				resultadoMenorOuIgual= aMenorOuIgual <= bMenorOuIgual;
						
				System.out.println(resultadoMenorOuIgual);
				
				// Lógicos
				
				boolean resultadoE;
				
				//resultadoE = (a == b) && (a != b);
				
				//System.out.println(resultadoE);
	}
	
	
	
	

}
