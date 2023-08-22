package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Util {
    public static void printProductMap(Map<String, Integer> productMap) {
        int index = 1;
        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            System.out.println(index + ") " + entry.getKey() + ", " + entry.getValue() + " kg");
            index++;
        }
    }

    public static void printContactMap(LinkedHashMap<String, String> contactMap) {
        int index = 1;
        for (Map.Entry<String, String> entry : contactMap.entrySet()) {
            System.out.println(index + ") " + entry.getKey() + " - " + entry.getValue());
            index++;
        }
    }

    public static void updateProductMap(Map<String, Integer> productMap) {
        productMap.put("banana", productMap.getOrDefault("banana", 0) + 14);
        productMap.put("plum", 15);
    }

    public static String getSearchProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product to search: ");
        return scanner.nextLine();
    }

    public static void searchAndPrintProduct(Map<String, Integer> productMap, String searchProduct) {
        Integer quantity = productMap.get(searchProduct);
        if (quantity != null) {
            System.out.println("Found: " + searchProduct + ", " + quantity + " kg");
        } else {
            System.out.println("Product not found: " + searchProduct);
        }
    }

    public static void updateContactMap(LinkedHashMap<String, String> contactMap) {
        contactMap.put("Tom", "tomasdev@glob.net");
    }
}
