package org.example;

import java.util.HashMap;

public class CustomDS {
    // Define a HashMap to store key-value pairs
    private HashMap<Integer, Node> hashMap;

    // Constructor to initialize the HashMap
    public CustomDS() {
        this.hashMap = new HashMap<>();
    }

    // Method to insert a key-value pair into the data structure
    public void insert(int key, int value) {
        // Create a new Node object with the given key and value
        Node node = new Node(key, value);
        // Insert the key-value pair into the HashMap
        hashMap.put(key, node);
    }

    // Method to get the value corresponding to the given key
    public int get(int key) {
        // Retrieve the Node object corresponding to the given key from the HashMap
        Node node = hashMap.get(key);
        // If the node is found, return its value; otherwise, return -1 (or throw an exception)

        if (node != null) {
            return node.value;
        } else {
            return -1;
        }

    }

    // Node class representing key-value pairs
    private class Node {
        int key;
        int value;

        // Constructor to initialize key and value
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    // return (node != null) ? node.value : -1;
}