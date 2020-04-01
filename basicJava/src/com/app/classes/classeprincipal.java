package com.app.classes;

public class classeprincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		casa minhaCasa = new casa(); //criacao do objeto
		minhaCasa.cor = "Azul";
		
		System.out.print(minhaCasa.cor);
		
		minhaCasa.abrirGaragem();
	}

}
