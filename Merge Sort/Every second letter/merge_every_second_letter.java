package merge;

import java.util.*;

public class merge_every_second_letter {
	
	public static void main (String [] args) {
		
		
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		
		
		System.out.print(merge(s1,s2));


	}


	public static String merge (String s1,String s2) {
		
		String s3 = "";
		int min = Math.min(s1.length(), s2.length());
		
		
			for(int i = 0;i<min;i++) {
				
			
			 s3 = s3 +s1.charAt(i)+s2.charAt(i);
			
		}
			if(s1.length()>min) {
				
				for(int i =min;i<s1.length();i++) {
					
					s3 = s3 +s1.charAt(i);
				}
			}
			
			if(s2.length()>min) {
							
				for(int i =min;i<s2.length();i++) {
					
					s3 = s3 +s2.charAt(i);
				}
			}

		return s3;
	}
}
