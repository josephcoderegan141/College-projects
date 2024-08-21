package cs210lab1;



public class Prime_checker{

    public static void main (String [] args){

        int lower = 2;
        int higher = 100;
        int w = 0;

        int [] array1 = new int [higher-lower];
        //int [] array1 = new int [100];


        for(int i = lower;i<higher;i++){
        	
        	checkprime(i);
        	
        	if(checkprime(i)==true) {
        		array1[w]=i;
        		//i=array1[w];
        		w++;
        	}
        	
        }

        System.out.print("Prime numbers are: ");
        
        for(int y =0;y<w;y++) {
        	System.out.print(array1[y]+" ");
        }
    }
    
    public static boolean checkprime(int i) {
    	
//    	if(i <=1) {
//    		
//        	return false;
//
//    	}
    	
        for(int x = 2;x<i;x++){

            if(i%x==0){// not prime
                
            	return false;
            }
            
        }
        return true;
    }
}