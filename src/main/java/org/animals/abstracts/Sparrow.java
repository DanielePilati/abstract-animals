package org.animals.abstracts;

public class Sparrow extends Animals implements Winged {

	public Sparrow() {
		
	}
	
	@Override
	public void sound() {
		System.out.println("Verso del Passerotto");
		
	}

	@Override
	public void eat() {
		System.out.println("Vermi");
		
	}

	@Override
	public void fly() {
		System.out.println("Sto Volando");
		
	}

	@Override
	public void swim() {
			System.out.println("Sto Nuotando");
		
	}
}
