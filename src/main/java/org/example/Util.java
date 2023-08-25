package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

class Util {
    public static <K, V> void printMap(Map<K, V> map, String task) {
        AtomicInteger index = new AtomicInteger(1);
        boolean b = task.equals("3");
        map.entrySet().stream()
                .map(entry -> index + ") " + entry.getKey() + (b ? " - " : ", ") + entry.getValue() + (b ? "" : " kg"))
                .forEach(System.out::println);
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
        System.out.println(quantity != null ? "Found: " + searchProduct + ", " + quantity + " kg" : "Product not found: " + searchProduct);
    }

    public static void updateContactMap(LinkedHashMap<String, String> contactMap) {
        contactMap.put("Tom", "tomasdev@glob.net");
    }
}
