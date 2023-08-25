package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        runDemo();
    }

    public static void runDemo(){
        task_1();
        System.out.println();
        task_2();
        System.out.println();
        task_3();
    }
    public static void task_1() {
        Map<String, Integer> products = DataProvider.createInitialProductMap();
        System.out.println("Initial data:");
        Util.printMap(products,"1");
        Util.updateProductMap(products);
        System.out.println("\nUpdated data:");
        Util.printMap(products,"1");
    }

    public static void task_2() {
        Map<String, Integer> products = DataProvider.createInitialProductMap();
        System.out.println("Product list:");
        Util.printMap(products,"2");
        String searchProduct = Util.getSearchProduct();
        Util.searchAndPrintProduct(products, searchProduct);
    }

    public static void task_3() {
        LinkedHashMap<String, String> contacts = DataProvider.createInitialContactMap();
        System.out.println("Initial contacts:");
        Util.printMap(contacts, "3");
        Util.updateContactMap(contacts);
        System.out.println("\nUpdated contacts:");
        Util.printMap(contacts, "3");
    }
}

