package com.karitoreyes.proyectozoo;

import com.karitoreyes.proyectozoo.Mamifero;

public class Gorila extends Mamifero {
	public void lanzarAlgo() {
		System.out.println("El gorila arroj� algo!");
		setNivelDeEnergia(getNivelDeEnergia()-5);
	}
	
	public void comerBananas() {
		System.out.println("El gorila se siente satisfecho de comer pl�tanos!!");
		setNivelDeEnergia(getNivelDeEnergia()+10);
	}
	public void escalar() {
		System.out.println("El gorila ha trepado un �rbol!");
		setNivelDeEnergia(getNivelDeEnergia()-10);
	}
}
