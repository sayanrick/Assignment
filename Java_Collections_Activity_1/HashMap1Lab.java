package Lab;
/*
 * @author Sayan Das
 */
import java.util.ArrayList;
import java.util.Iterator;

public class HashMap1Lab {
	//creating an arraylist
	 ArrayList<Integer> A1=new ArrayList<Integer>();

	 ArrayList<Integer> storeEvenNumbers(int N) {//1st method
		 for(int i=2;i<=N;i++) {//for loop  
		if(i%2==0) {//logic
			A1.add(i);
		}
		 }
		 return A1;	 
	 }
	 ArrayList<Integer> A2=new ArrayList<Integer>();

	 ArrayList<Integer> printEvenNumbers() {//2nd method
		Iterator<Integer> itr=A1.iterator();
		while(itr.hasNext()) {
			A2.add(itr.next()*2);
		}	 
		 return A2;
	 }
	 void retrieveEvenNumber(int n){//3rd method
		 if(A1.contains(n)) {//logic to check the number
			 System.out.println(n);//if present print this
		 }
		 else {
			 System.out.println("zero");//else print zero
		 }
	 }
	public static void main(String[] args) {
		HashMap1Lab h=new HashMap1Lab();

		System.out.println(h.storeEvenNumbers(12));
		System.out.println(h.printEvenNumbers());
		h.retrieveEvenNumber(10);	
	}
}
