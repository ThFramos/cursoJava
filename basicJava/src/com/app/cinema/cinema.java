package com.app.cinema;
import java.util.Scanner;
public class cinema {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		// dados sistema
				
		String data_sistema;
		int sala_sistema;
		data_sistema="quarta-feira";
		sala_sistema= 2;
		String hora_sistema;
		hora_sistema= "12h10";
		String filme_sistema;
		filme_sistema= "marvel";
		
		
		// informações recebida do usuario
		
	
		String data_usuario,hora_usuario,filme_usuario;
		int sala_usuario;
				
		  
			System.out.println("Digite a data. ex: quarta-feira");
			data_usuario= entrada.next();

			System.out.println("Digite a hora. ex: 10h30");
			hora_usuario= entrada.next();
			

			System.out.println("Digite o Filme. ex: Marvel");
			filme_usuario= entrada.next();
			

			System.out.println("Digite a sala. ex: 1");
			sala_usuario= entrada.nextInt();
		
		// comparando dados
		boolean bilhete,sala_comparar;
		bilhete = true;
		
		if (bilhete == true) {
			if (data_usuario.equals(data_sistema)){
				if (hora_usuario.equals(hora_sistema)){
					if (filme_usuario.equals(filme_sistema)) {
						if (sala_usuario==sala_sistema) {
							 System.out.println("               Bom filme!!!!");
			}else { System.out.println("sala incorreta");}
			}else { System.out.println("Filme incorreto");}					
			}else { System.out.println("Hora errada");}				
			}else { System.out.println("Data errada");}
			}else { System.out.println("Bilhete falso");}
	}
	
}