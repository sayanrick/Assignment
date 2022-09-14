package Lab;
/*
 * @ owashim chowdhury
 */
import java.util.ArrayList;

import java.util.ArrayList;


public class ThreadListLoader implements Runnable{
	public void run() {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(10000000);

		//for loop
		for (int i = 0; i <= 10000000; i++)
		{
			//adding values
		   numbers.add(i);
		   System.out.println(numbers.get(i));
		}	
		//calculating time
		System.out.println("time taken in ms:"+System.currentTimeMillis ());
	}

		public static void main(String[] args) {
			Runnable r= new ThreadListLoaderLab();
		
			Thread t=new Thread(r);//creating object
			t.start();
			
		}
	
	}
