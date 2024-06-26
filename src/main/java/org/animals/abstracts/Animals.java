package org.animals.abstracts;

public abstract class Animals implements Swimmer{
	
	public void sleep() {
		System.out.println("ZzZzZzZzZz");
	}
	public abstract void sound();
	public abstract void eat();
}
