package cs211_lab1;
import java.util.Scanner;
public class traitors_game {
	


    public static void main(String[] args) {
       
        int traitors = 15;
        int simulations = 10000;
        int wins = 0;
        for (int i = 0; i < simulations; i++) {
            if (simulation(traitors)) wins++;
        }
        System.out.println("Traitors win: " + ((double) wins / simulations));
  
    }

    static boolean simulation(int traitors) {
        int total = 22;
        int faithful = total - traitors;
        
        while (total > 2) {
        	
            if (Math.random() < ((double) traitors / total)) { //math.random generates a num between 0.0 and 1
                traitors--;									   //(traitors/ total) gets the probability of an event happening
            } else {										   //
                faithful--;
            }
            faithful--;
            total = traitors + faithful;
        }
        
       
        return traitors > 0;
    }
}




