package com.capgemini.assignment;

public class Animal {
	void food() {
		System.out.println("Different kind of foods for different animal");
	}
}
class Lion extends Animal{  
void food(){
	System.out.println("Lion is a carnivorous..");
	}  
}  
class Rabbit extends Animal{  
void food(){
	System.out.println("Rabbit is a herbivorous...");
	}  
}  
class Horse extends Animal{  
void food(){
	System.out.println("Hourse is also herbivorous..");
	}  
}

class Dog extends Animal{  
void food(){
	System.out.println("Dogs are omnivores...");
	}  
}

class Testing_animal{  
public static void main(String args[]){ 
	
 Animal ob = new Animal();  
 ob.food();
 
 Animal L = new Lion();
 L.food();
 
 Animal R = new Rabbit();
 R.food();

 Animal H = new Horse();
 H.food();
 
 Animal D = new Dog();
 D.food();
}
}
