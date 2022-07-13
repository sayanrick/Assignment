package com.assingment;

public class Arithmetic {
	int add(int a, int b, int c) {
		return a+b+c;
	}
}

class Adder extends Arithmetic {
	public static void main(String[] args) {
		Adder obj = new Adder();
		System.out.println("Sum:- " + obj.add(10, 20, 30));
		
	}
}
