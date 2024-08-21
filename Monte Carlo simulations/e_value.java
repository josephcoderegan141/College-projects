package lab4;
import java.util.Random;

public class e_value {
	
	
	    public static void main(String[] args) {
	        int x = 10000; 
	        double sum = 0;
	        Random rand = new Random();
	        
	        int counter =0;
	        double estimate =0.0;

	        for (int i = 1; i < x; i++) {
	        	
	        	while(sum<=1) {
	        		
	        		double w  = rand.nextDouble();
		        	//sum += Math.pow(1+1/w, w);
	        		sum+=w;
	        		counter ++;   // counts how many times it takes values to be greater 
	        	}				//then 1
	        	
	        	estimate += (double)counter/x;
	        	sum =0;
	        	counter=0;
	          
//	        	
//	        	double w  = rand.nextDouble();
//	        	sum += Math.pow(1+1/w, w);
            
	        }

	        double e = 2+ sum ;

	       // System.out.println("Estimated value of e: " + e);
	        System.out.println("Estimated value of e: " + estimate);
	    
	}

}
