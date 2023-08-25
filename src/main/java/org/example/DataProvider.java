package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class DataProvider {
    public static Map<String, Integer> createInitialProductMap() {
        Map<String, Integer> products = new HashMap<>();
        products.put("orange", 12);
        products.put("banana", 25);
        products.put("lemon", 8);
        products.put("pineapple", 13);
        products.put("grape", 9);
        return products;
    }

    public static LinkedHashMap<String, String> createInitialContactMap() {
        LinkedHashMap<String, String> contacts = new LinkedHashMap<>();
        contacts.put("Tom", "tom@mail.com");
        contacts.put("Lisa", "lisa@mail.com");
        contacts.put("Alice", "alisa@mail.com");
        contacts.put("Denis", "den@mail.com");
        return contacts;
    }
}
