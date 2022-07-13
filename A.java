// This is an example of Multilevel inheritance

package com.assingment;


public class A {
	void class_one() {
		System.out.println("This is a method of class A...");
	}

}

class B extends A {
	void class_two() {
		System.out.println("This is a method of class B...");
	}

}

class C extends B {
	void class_three() {
		System.out.println("This is a method of class C...");
	}

}

class Hjaka {
	public static void main(String[] args) {
		C obj = new C();
		obj.class_three();
		obj.class_two();
		obj.class_one();
	}
}
