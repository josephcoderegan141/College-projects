package spicy_prime_Q;

import java.util.Scanner;

public class sieve {
	

	
	public static void main(String [] args)
	{
		
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int fin = scan.nextInt();
		scan.close();
		int c = 0;
		
		
//		if(start>fin) {   // if bigger number is first
//			int o= start;
//			int p = fin;
//			fin=o;
//			start=p;
//				
//		}
		
		int r = fin-start;
		
		boolean [] prime = new boolean [r];
		
		for(int i =0;i<prime.length;i++) {
			
			prime[i]=true;
			
		}
		
		for(int i =2;i<Math.sqrt(r);i++) {
			
			if(prime[i]==true) {
				for(int j =(i*i);j<r;j=j+1) {
					
					prime[j]=false;
				}
			}
		}
		
		//System.out.println("The total number of prime numbers is: " +w);
		
		for(int i=2;i<prime.length;i++) {
			
			if(prime[i]==true) {
				//System.out.print(i);
				c++;
			}
		}
		System.out.print(c);		
	}
}
		
		
		
		
		
		
//		for(long i = start;i<=fin;i++) {
//			
//			if (Prime(i)!=100) {
//					
//			//System.out.println(Prime(i));	
//				w++;
//			}
//		}
	
	
//	static long Prime(long n) {
//		
//		long y= 100;  // false
//	    if(n < 2) return y;
//	    if(n == 2 || n == 3) return n;
//	    if(n%2 == 0 || n%3 == 0) return y;
//	    long sqrtN = (long)Math.sqrt(n)+1;
//	    for(long i = 6L; i <= sqrtN; i += 6) {
//	        if(n%(i-1) == 0 || n%(i+1) == 0) return y;
//	    }
//	    return n;
//	}



