package merge;

import java.util.Scanner;


// only works if first string is longer 

public class alphabeticalmerge {
	
	public static void main (String [] args) {
			
			
			Scanner scan = new Scanner(System.in);
			String s1 = scan.nextLine();
			String s2 = scan.nextLine();
			
			System.out.print(merge(s1,s2));
		}

		public static String merge (String s1,String s2) {
			
			String s3 = "";
			int size = s1.length()+ s2.length();
			
			int i =0;
			int j = 0;
			
				while(i<s1.length() && j <s2.length()) {
					
					if(s1.charAt(i)<s2.charAt(j)) {
						
						
						s3 = s3+s1.charAt(i);
						i++;

					}
					
//					if(s2.charAt(j)<s1.charAt(i)) {
					
					else {
 
						s3 = s3+s2.charAt(j);
						j++;
						
					}
					
				}
										
			      if (s1.length() > i) {
			            for (int k = i; k < s1.length(); k++) {
			                s3 = s3 + s1.charAt(k);
			            }
//						s3 = s3+s1.substring(i);

			        }

			        if (s2.length() > j) {
			            for (int k = j; k < s2.length(); k++) {
			                s3 = s3 + s2.charAt(k);
			            }
//						s3 = s3+s2.substring(j);

						
			        }
	
			return s3;
				
		}

}
