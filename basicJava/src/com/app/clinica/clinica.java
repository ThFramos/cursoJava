package com.app.clinica;

public class clinica {

	public static void main(String[] args) {
		// Variáveis Sistema
		
		String paciente_sistema, data_sistema, hora_sistema, medico_sistema;
		paciente_sistema= "Lucas";
		data_sistema= "10/11/2018";
		hora_sistema= "10h";
		medico_sistema= "Pedro";
		
		int secao_sistema=2;
		/*	1 - Acupuntura; 
			2 - Massoterapia; 
			3 - Ortomolecular;
			4 - PNL;
			5 - Quiropraxia;
		*/
		
		// Variáveis Usuario
		
				String paciente_usuario, data_usuario, hora_usuario, medico_usuario;
				paciente_usuario= "Lucas";
				data_usuario= "10/11/2018";
				hora_usuario= "10h";
				medico_usuario= "Pedro";
				
				int secao_usuario=1;
				
		// Variável comparação
				
				boolean paciente_comparar, data_comparar, hora_comparar, medico_comparar, secao_comparar;
				
				paciente_comparar= paciente_sistema == paciente_usuario;
				data_comparar= data_sistema==data_usuario;
				hora_comparar= hora_sistema==hora_usuario;
				medico_comparar= medico_sistema==medico_usuario;
				secao_comparar= secao_sistema==secao_usuario;
				
		// Início da programação
				
				
	}

}
