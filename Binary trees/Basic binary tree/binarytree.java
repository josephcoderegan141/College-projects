package BinaryTree;
import java.util.*;


class Node {     ///              
    int value;
    Node left;
    Node right;   

    public Node(int item) {     
        value = item;           //Constructor for creating a new node with a given value.
        left = right = null;    //no children
    }
}                           



class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void insert(int value) {
        root = insertRec(root, value); // actually inserts in to the tree using root as a refernec but then as it
    }                                  // i scalled recursivly value gets updated

    Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);// set root node to current value(first element)
            return root;
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    int maxDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }
}

public class binarytree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        System.out.println("Enter the numbers to insert: ");
        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(",");
        
        for (int i = 0; i < values.length; i++) {
            tree.insert(Integer.parseInt(values[i].trim()));
        }
        
        System.out.println("The resulting binary tree has " + tree.maxDepth(tree.root) + " levels.");
        
    }
}

//tree.root
