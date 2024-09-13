package second;

import java.util.Scanner;

class Node { //STACK
    String data;
    Node next;

    public Node(String data) { // CONSTRUCTER
        this.data = data;
        this.next = null;
    }
}

class LinkedList {//FIRST ORIGINAL LINK
    Node head;

//    public LinkedList() {  // DONT NEED IT INITALISING IT WITH NO VALUE DOES SAME THING (CONSTRUCTOR)
//        head = null;
//    }

    public void addToHead(String data) {//add 
    	
        Node newNode = new Node(data);
        newNode.next = head;           // BUBBLE SORT
        head = newNode;
    }

    public void printList() { // DISPLAY
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

public class linklistfinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();//create object 

        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (word.equals("END")) {
                break;
            }

            linkedList.addToHead(word);
        }

        System.out.println("Linked list contents:");
        linkedList.printList();
    }
}