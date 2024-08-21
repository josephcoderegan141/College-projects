package lab4;

import java.util.Random;

public class pi_value {
	
	public static void main(String [] args) {
		
		int x = 10000000;
		Random rand = new Random();
		double count = 0;
		
		for(int i =1;i<x;i++) {
		
			double w = rand.nextDouble();// generates a number less the 1
			double y = rand.nextDouble();
			
			double sum = Math.sqrt(Math.pow((w-0), 2)+ Math.pow((y-0),2));
            //double sum = w * w + y * y; // checking if points inside circle

			
			if(sum<=1) {
				
				count++;
			}
			
			
		}
		
		double ans= (count/x)*4;
		
		System.out.println("Value of pie is: " + ans);
		//System.out.println(count);

		
		
	}

}
