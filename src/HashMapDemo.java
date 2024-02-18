import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 22);

        // Accessing values using keys
        System.out.println("Age of John: " + hashMap.get("John"));
        System.out.println("Age of Alice: " + hashMap.get("Alice"));

        // Updating a value
        hashMap.put("Bob", 23);
        System.out.println("Updated age of Bob: " + hashMap.get("Bob"));

        // Checking if a key is present
        String keyToCheck = "Alice";
        if (hashMap.containsKey(keyToCheck)) {
            System.out.println(keyToCheck + " is present in the HashMap.");
        } else {
            System.out.println(keyToCheck + " is not present in the HashMap.");
        }

        // Iterating through the HashMap
        System.out.println("\nHashMap entries:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Removing a key-value pair
        String keyToRemove = "John";
        if (hashMap.containsKey(keyToRemove)) {
            hashMap.remove(keyToRemove);
            System.out.println("\nRemoved " + keyToRemove + " from the HashMap.");
        }

        // Size of the HashMap
        System.out.println("\nSize of the HashMap: " + hashMap.size());
    }
}

