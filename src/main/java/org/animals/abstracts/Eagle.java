package org.animals.abstracts;

public class Eagle extends Birds {

	public Eagle() {
		
	}
	
	@Override
	public void sound() {
		System.out.println("Verso dell'Aquila");
		
	}

	@Override
	public void eat() {
		System.out.println("Animali di piccola taglia");
		
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
