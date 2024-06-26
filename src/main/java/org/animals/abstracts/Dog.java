package org.animals.abstracts;

public class Dog extends Mammal {

	@Override
	public void sound() {
		System.out.println("Verso del Cane");
	}

	@Override
	public void eat() {
		System.out.println("Croccantini");
	}

}
