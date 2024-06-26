package org.animals.abstracts;

public class Main {

	
	public static void separator() {
		System.out.println();
		System.out.println("---------------------");
		System.out.println();
	}
	
	public static void faiVolare(Winged winged) {
		winged.fly();
	}
	public static void faiNuotare(Swimmer swimmer) {
		swimmer.swim();
	}
	
	public static void main(String[] args) {
		
		System.out.printf("Hello Zoo");
		
		Dog dog = new Dog();
		Dolphin dolphin = new Dolphin();
		Sparrow sparrow = new Sparrow();
		Eagle eagle = new Eagle();
		
		Main.separator();
		
		System.out.println("Il cane mangia :");
		dog.eat();
		System.out.println("il cane fa :");
		dog.sound();
		System.out.println("Dorme :");
		sparrow.sleep();
		
		Main.separator();
		
		System.out.println("Il delfino mangia :");
		dolphin.eat();
		System.out.println("il delfino fa :");
		dolphin.sound();
		System.out.println("Dorme :");
		sparrow.sleep();
		
		Main.separator();
		
		System.out.println("Il passerotto mangia :");
		sparrow.eat();
		System.out.println("il passerotto fa :");
		sparrow.sound();
		System.out.println("Dorme :");
		sparrow.sleep();
		
		Main.separator();
		
		System.out.println("L'Aquila mangia :");
		eagle.eat();
		System.out.println("il delfino fa :");
		eagle.sound();
		System.out.println("Dorme :");
		sparrow.sleep();
		
		Main.separator();
		
		System.out.println("Il cane nuota :");
		faiNuotare(dog);
		
		Main.separator();
		
		System.out.println("Il il passero vola :");
		faiVolare(sparrow);

	}

}
