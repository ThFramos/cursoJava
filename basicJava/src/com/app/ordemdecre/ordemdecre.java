package com.app.ordemdecre;





public class ordemdecre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int azul,verde,vermelho;
		
		azul = 10;
		verde = 9;
		vermelho = 9;
		
		
		if (vermelho>verde && vermelho>azul ) {
			if(verde>azul) {
				System.out.println("1º vermelho="+vermelho+"\r\n"+"2º verde="+verde+"\r\n"+"3º azul="+azul);
			}
			else {
				System.out.println("1º vermelho="+vermelho+"\r\n"+"2º azul= "+azul+"\r\n"+"3º verde="+verde);
			}
		
		}
		else if (verde>vermelho && verde>azul) {
			if(vermelho>azul) {
				System.out.println("1º verde= "+verde+"\r\n"+"2º vermelho= "+vermelho+"\r\n"+"3º azul= "+azul);
			}
			else {
				System.out.println("1º verde= "+verde+"\r\n"+"2º azul "+azul+"\r\n"+"3º vermelho= "+vermelho);
			}
		}
		else if (azul>vermelho && azul >verde) {
						
			if(vermelho>verde) {
				System.out.println("1º azul= "+azul+"\r\n"+"2º vermelho= "+vermelho+"\r\n"+ "3º verde= "+verde);
			}
			else {
				System.out.println("1º azul= "+azul+"\r\n"+ "2º verde= "+verde+"\r\n"+"3º vermelho= "+vermelho);
			}
		}
	}
}
	


