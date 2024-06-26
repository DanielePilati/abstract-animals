package org.animals.abstracts;

public class MyZoo {

	
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
		
		MyZoo.separator();
		
		System.out.println("Il cane mangia :");
		dog.eat();
		System.out.println("il cane fa :");
		dog.sound();
		
		MyZoo.separator();
		
		System.out.println("Il delfino mangia :");
		dolphin.eat();
		System.out.println("il delfino fa :");
		dolphin.sound();
		
		MyZoo.separator();
		
		System.out.println("Il passerotto mangia :");
		sparrow.eat();
		System.out.println("il passerotto fa :");
		sparrow.sound();
		sparrow.sleep();
		
		MyZoo.separator();
		
		System.out.println("L'Aquila mangia :");
		eagle.eat();
		System.out.println("il delfino fa :");
		eagle.sound();
		
		MyZoo.separator();MyZoo.separator();MyZoo.separator();
		
		System.out.println("Il cane nuota :");
		faiNuotare(dog);
		
		MyZoo.separator();
		
		System.out.println("Il il passero vola :");
		faiVolare(sparrow);

	}

}
