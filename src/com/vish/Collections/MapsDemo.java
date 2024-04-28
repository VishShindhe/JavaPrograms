package com.vish.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * HashMap: Unordered
 * TreeMap: Sorted alphabetically
 * LinkedHashMap: maintains insertion order of keys
 * ConcurrentHashMap: ThreadSafe implementation of HashMap
 */

public class MapsDemo {
    public static void main(String[] args) {
        Map<String, Integer> students = new ConcurrentHashMap<>();
        students.put("Sheldon", 100);
        students.put("Lenard", 90);
        students.put("Raj", 85);
        students.put("Howard", 85);
        students.put("Penny", 40);

        System.out.println(students);
        for(String key: students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }
    }
}
