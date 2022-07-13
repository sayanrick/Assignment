package com.capgemini.assignment;

public class Shape {
	void area() {
		System.out.println("for every particular shape there are different formula for area");
}
}
class Rectangle extends Shape{  
void area(){
	System.out.println("Area of rectangle is :- width x length");
	}  
}  
class Circle extends Shape{  
void area(){
	System.out.println("Area of circle is :- 3.14 * r * r");
	}  
}  
class Triangle extends Shape{  
void area(){
	System.out.println("Area of triangle is :- 0.5 * (base * height)");
	}  
}

class Square extends Shape{  
void area(){
	System.out.println("Area of square is :- area * area");
	}  
}

class Testing{  
public static void main(String args[]){ 
	
 Shape ob = new Rectangle();  
 ob.area();
 Shape obj = new Rectangle();  
 obj.area();
 
 Shape obj1 = new Circle();  
 obj1.area();
 
 Shape obj2 = new Triangle();  
 obj2.area();
 
 
 Shape obj3 = new Square();  
 obj3.area();
  
}
}
