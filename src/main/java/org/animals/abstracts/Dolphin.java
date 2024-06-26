package org.animals.abstracts;

public class Dolphin extends Mammal {

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
