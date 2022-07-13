package com.assingment;

class Bank{  
float getRateOfInterest(){
	return 0;
	}
}

class SBI extends Bank{  
float getRateOfInterest(){ 
	return 8;
	}
}  
  
class ICICI extends Bank{  
float getRateOfInterest(){
	return 7;
	}
}

class AXIS extends Bank{  
float getRateOfInterest(){
	return 9;
	} 
}  


class Akkkk{  
public static void main(String args[]){  
SBI obj1 =new SBI(); 

ICICI obj2 =new ICICI(); 

AXIS obj3 =new AXIS(); 


System.out.println("SBI Interest: "+obj1.getRateOfInterest()); 

System.out.println("ICICI Interest: "+obj2.getRateOfInterest()); 

System.out.println("AXIS Interest: "+obj3.getRateOfInterest());  
}  
}  