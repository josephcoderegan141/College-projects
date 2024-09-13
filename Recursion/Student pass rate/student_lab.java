package cs211_lab2;


//In Java, the .equals() method is used to compare the contents of two objects for equality. 
//It is commonly used with strings to check if two strings have the same sequence of characters. 
//When applied to strings, the equals() method compares the characters of the strings, 
//ensuring both the content and the order of characters are the same.

import java.util.*;

public class student_lab {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		System.out.print(grade(s1,0,0,0,false));
		
		
	}
	
	public static String grade (String s1,int x,int lates,int absent,boolean con ) {
		
		
		
		
	
	if(x==s1.length()) {  //x
		
		if( absent>=2|| con == true) {
			return "Student failed";
		}

		else {
			return "Student passed";
		}
		
		
	}
	
	else {
		
		char position = s1.charAt(x);
		
		if(position =='l' ||position =='L') {
			
			lates++;
			
			if(lates>=3) {
				
				con = true;
			}
			
		}
		

		if(position =='A' || position=='a') {
					
			absent++;
			lates=0;
			
		}
		
//		else {
//			lates =0;
//		
//		}
		
		x++;
		
		return grade(s1,x,lates,absent,con);
			
			
		}
	}

}
