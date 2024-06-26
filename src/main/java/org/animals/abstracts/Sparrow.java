package org.animals.abstracts;

public class Sparrow extends Birds {

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

}
