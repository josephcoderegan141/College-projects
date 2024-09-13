package cs211_lab2;
import java.util.*;

public class Loan_recurssion {
	

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double amount = scan.nextDouble();
        double interest = scan.nextDouble();
        int repayments = scan.nextInt();
        
      System.out.print("total months: "+loan(amount,interest,repayments,0));
        
    }

    public static int loan(double amount, double interest,int repayments,int x){


        if(amount <= 0.0){

            return x;
        }

        else {
        	
        	double sum = amount*(interest/100/12);
        	double after =amount-repayments;
        	double result = after+sum;
        	
        	x++;
        	return loan(result,interest,repayments,x);  // make things that need to incremented a parameter so they get updated properly
        	
        }
        	
       }
}
