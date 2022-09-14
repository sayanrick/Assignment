package Lab;
/*
 * @author Sayan Das
 */
import java.util.HashSet;

public class HashsetProblem2 {
	String country;
	//creating a hashset
	HashSet<String>H1=new HashSet();

	HashSet<String> storeCountryNames(String CountryName) {//1st method

		H1.add(CountryName);//adding value
		return H1;
	}
	
	  void  retrieveCountry(String CountryName) {//2nd method 
		if(H1.contains(CountryName)) {//if present logic
			System.out.println(CountryName+": is present in hashmap");//if satisfied print this
		}
		else {	
		System.out.println("null");
		}
	 }
	
	public static void main(String[] args) {
		//creating object
		HashsetProblem2 h=new HashsetProblem2();
		System.out.println("hashmap country "+h.storeCountryNames("india"));
		h.retrieveCountry("india");
	
	}

}
