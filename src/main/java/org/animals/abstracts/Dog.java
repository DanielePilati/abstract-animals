package org.animals.abstracts;

public class Dog extends Mammal {

	public Dog() {
		
	}
	
	@Override
	public void sound() {
		System.out.println("Bau Bau");
	}

	@Override
	public void eat() {
		System.out.println("Croccantini");
	}

}
