package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
    }

    public static void task_1() {
        Map<String, Integer> products = DataProvider.createInitialProductMap();
        System.out.println("Initial data:");
        Util.printProductMap(products);
        Util.updateProductMap(products);
        System.out.println("\nUpdated data:");
        Util.printProductMap(products);
    }

    public static void task_2() {
        Map<String, Integer> products = DataProvider.createRandomProductMap();
        System.out.println("Product list:");
        Util.printProductMap(products);
        String searchProduct = Util.getSearchProduct();
        Util.searchAndPrintProduct(products, searchProduct);
    }

    public static void task_3() {
        LinkedHashMap<String, String> contacts = DataProvider.createInitialContactMap();
        System.out.println("Initial contacts:");
        Util.printContactMap(contacts);
        Util.updateContactMap(contacts);
        System.out.println("\nUpdated contacts:");
        Util.printContactMap(contacts);
    }
}

