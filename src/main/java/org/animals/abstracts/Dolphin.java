package org.animals.abstracts;

public class Dolphin extends Animals {

	public Dolphin() {
		
	}
	
	@Override
	public void sound() {
		System.out.println("Verso del Delfino");
		
	}

	@Override
	public void eat() {
		System.out.println("Pesci");
		
	}

	@Override
	public void swim() {
			System.out.println("Sto Nuotando");
		
	}
}
