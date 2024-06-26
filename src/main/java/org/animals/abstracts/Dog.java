package org.animals.abstracts;

public class Dog extends Animals {

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

	@Override
	public void swim() {
			System.out.println("Sto Nuotando");
		
	}
}
