package cs210lab2;

public class Card_Validator {
	
	public static void main(String [] args) {
		
		String X = "4539682995824395";
		
		cardchecker(X);
		
		if(cardchecker(X)==true) {
			System.out.print("VALID");
		}
		
		else{
			
			System.out.print("NOT VALID");

		}
		
		
	}
	
	public static boolean cardchecker(String s) {
		
		int[]	a1 = new int[s.length()]; //make new array
		
		for(int i=0;i<s.length();i++) {
			
			a1[i]= Integer.parseInt(s.substring(i,i+1)); //for loop that takes a substring of string and changes it to an int
			                                             //then adds it to the int array                          
		}
		
		
		
		for(int y = a1.length-2;y>=0;y=y-2) {//actually changes the values 
//important part of luhns algorithmn^^	
			int count = a1[y];
			count =count*2;
			if(count>10) {
				count=count-9;
			}
			
			a1[y]= count;
		}
		
		int total = 0; 
		
		for(int i =0;i<a1.length;i++) { // gets total
			
			total += a1[i];
		}
		
		if(total%10 ==0) {
			
			return true;
		}
		
		else {
			return false;
		}
		
	}
		
				

}
