package solution;

import java.util.*;
import java.io.*;
public class QueueLab {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\eganj\\Downloads\\code");

        int inputSize = 1000;
        String[] input = new String[inputSize];
        try {
            Scanner scan = new Scanner(file);

            for (int i = 0; i < inputSize; i++) {
                input[i] = scan.nextLine();
            }
            scan.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        Queue myqueue = new Queue(100);
        for (int i = 0; i < inputSize; i++) {
            if (input[i].split("\t")[0].equals("INSERT")) {
                myqueue.insert(input[i].split("\t")[1]);
            } else {
                myqueue.remove();
            }
        }
        System.out.println(myqueue.peekFront());
    }
}