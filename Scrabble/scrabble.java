package cs210;

import java.util.Scanner;

public class scrabble {
	
	
	public static void main(String [] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt(); //number of words 
		scan.nextLine();
		String [] array1 = new String [x];
	
		for(int i = 0;i<x;i++) {
			
			array1[i]=scan.nextLine().toUpperCase();	
		}
		

			
			for(int i=0;i<array1.length;i++) {// bubble sort
				for(int j = 0;j<x;j++) {
					
				if(scores(array1[i]) < scores(array1[j])) {
					
					String temp=array1[i];
					array1[i]=array1[j];
					array1[j]= temp;
				}
				

				if(scores(array1[i])==scores(array1[j])) {
					
					if(array1[i].compareTo(array1[j])<0) {
						
						String temp=array1[i];
						array1[i]=array1[j];
						array1[j]= temp;
						
					}
					}
				}
			
			}
		
			for(int i = 0;i<x;i++) {
			System.out.println(array1[i]); // giving the inputs a value
		}
	}
		
				
	
	public static int scores (String s1) {
		
		
		int score =0;
		String s3=s1;
		s3.toUpperCase(); // try2
		
		for(int i=0;i<s1.length();i++) {
			char c1 =s1.charAt(i);
			
			if( c1 == 'A' ||c1 =='E'|| c1 =='I'|| c1 =='O'||c1 == 'U'|| c1 =='L'||c1 =='N' ||c1 =='S' ||c1 =='T' ||c1 =='R') {
				
				score++;
			}
			
			if( c1 == 'D' ||c1 =='G') {
				
				score= score+2;
			}
			
			if( c1 == 'B' ||c1 =='C' ||c1 == 'M' ||c1 =='P') {
				
				score= score+3;
			}
				
			if( c1 == 'F' ||c1 =='H' ||c1 == 'V' ||c1 =='W'||c1 == 'Y') {
				
				score= score+4;
			}
			if( c1 == 'K') {
				score= score+5;
			}
			if( c1 == 'J'||c1=='X') {
				score= score+8;
			}
			if( c1 == 'Q'||c1=='Z') {
				score= score+10;
			}
			
		
		}
		
		//String s2=Integer.toString(score);
		return score;
		
	}
	
}
