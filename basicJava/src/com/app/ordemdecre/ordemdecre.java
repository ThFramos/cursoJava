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
				System.out.println("1� vermelho="+vermelho+"\r\n"+"2� verde="+verde+"\r\n"+"3� azul="+azul);
			}
			else {
				System.out.println("1� vermelho="+vermelho+"\r\n"+"2� azul= "+azul+"\r\n"+"3� verde="+verde);
			}
		
		}
		else if (verde>vermelho && verde>azul) {
			if(vermelho>azul) {
				System.out.println("1� verde= "+verde+"\r\n"+"2� vermelho= "+vermelho+"\r\n"+"3� azul= "+azul);
			}
			else {
				System.out.println("1� verde= "+verde+"\r\n"+"2� azul "+azul+"\r\n"+"3� vermelho= "+vermelho);
			}
		}
		else if (azul>vermelho && azul >verde) {
						
			if(vermelho>verde) {
				System.out.println("1� azul= "+azul+"\r\n"+"2� vermelho= "+vermelho+"\r\n"+ "3� verde= "+verde);
			}
			else {
				System.out.println("1� azul= "+azul+"\r\n"+ "2� verde= "+verde+"\r\n"+"3� vermelho= "+vermelho);
			}
		}
	}
}
	


