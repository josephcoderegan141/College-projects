package lab7;

import java.io.File;

//Sample sentence to translate:The quick brown fox jumped over the lazy dog

import java.util.*;

import BinaryTree.Node;

class Node {
    String key; // english 
    String value; // translation to spanish
    Node left, right;

    public Node(String key, String value) {
        this.key = key;
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    Node root;
    
    
    public BinarySearchTree() {
        root = null;
    }

    void insert(String key, String value) {
        Node newNode = new Node(key, value);
        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;
        while (true) {
            parent = current;
            if (key.compareTo(current.key) < 0) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else if (key.compareTo(current.key) > 0) {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            } else {
                current.value = value;
                return;
            }
        }
    }

    public String search(Node root, String key) {
        Node current = root;
        while (current != null) {
            if (current.key.equalsIgnoreCase(key)) {
                return current.value;
            } else if (key.compareToIgnoreCase(current.key) > 0) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return key;
    }
    
    int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        Stack<Node> nodes = new Stack<>();
        Stack<Integer> depths = new Stack<>();

        nodes.push(root);
        depths.push(1);

        int maxDepth = 0;

        while (!nodes.isEmpty()) {
            Node current = nodes.pop();
            int depth = depths.pop();

            if (current != null) {
                maxDepth = Math.max(maxDepth, depth);
                nodes.push(current.left);
                depths.push(depth + 1);
                nodes.push(current.right);
                depths.push(depth + 1);
            }
            maxDepth = depth;
        }

        return maxDepth;
    }
}



public class binarytreeSearcher {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\eganj\\Downloads\\211lab7file.csv");

        BinarySearchTree bst = new BinarySearchTree();

        List<String[]> translations = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    translations.add(new String[]{parts[0].trim(), parts[1].trim()});
                }
            }
            scan.close();

            for (String[] translation : translations) {
                bst.insert(translation[0].toLowerCase(), translation[1]);
            }

        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println("Enter a sentence to translate:");
        String inputSentence = sc.nextLine();
        String[] words = inputSentence.split("\\s+");
        StringBuilder translatedSentence = new StringBuilder();

        for (String word : words) {
            String translatedWord = bst.search(bst.root, word.toLowerCase());
            translatedSentence.append(translatedWord).append(" ");
        }

        System.out.println("The translation of the sentence/word is: " + translatedSentence.toString().trim());
        System.out.println("The resulting binary tree has height: " + bst.maxDepth(bst.root) );
    }
}