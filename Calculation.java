package com.capgemini.assignment;

public class Calculation {
	int no1;
	int no2;
	int no3;
	String name;
	
	Calculation(int a, int b, int c, String n) {
		no1 = a;
		no2 = b;
		no3 = c;
		name = n;
	}
	
	void display() {
		int abc = no1 *  no2 * no3;
		System.out.println(name + " " + abc);
	}

}

class NewCal extends Calculation {
	String lastN;
	NewCal (int a, int b, int c, String n, String m) {
		super(a, b, c, n);
		lastN = m; 
		
		
	}
}
class A {
	public static void main(String[] args) {
		Calculation c = new Calculation(22, 33, 11, "Sayan");
		c.display();
		
		NewCal n = new NewCal(22, 33, 11, "Sayan", "Das");
		n.display();
	}
}