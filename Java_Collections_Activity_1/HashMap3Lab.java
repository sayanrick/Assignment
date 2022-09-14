package Lab;
/*
 * @author Sayan Das
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMap3Lab {
String CountryMap;
//creating hashmap
HashMap<String,String> M1=new HashMap<String,String>();

void storeCountryCapital(String CountryName, String capital) {//1st method
	M1.put(CountryName, capital);//adding the key value pair
}
void retrieveCapital(String CountryName) {//2nd method
	
	for (Map.Entry en:M1.entrySet()) {//for each loop to get key value
		
		System.out.println(en.getKey()+":"+en.getValue());
	}
}

void retrieveCountry(String capitalName) {
	for (Map.Entry en:M1.entrySet()) {//for each loop to get key value
		
		System.out.println(en.getKey()+":"+en.getValue());}

}



	public static void main(String[] args) {
		//object creation
		HashMap3Lab m=new HashMap3Lab();
		//calling and adding value
		m.storeCountryCapital("india", "delhi");
		m.storeCountryCapital("japan", "Tokyo");

		m.retrieveCapital("india");
		m.retrieveCountry("delhi");
	}

}
