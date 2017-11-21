package com.horiachiy.paul;

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static List<Hobby> arrList = new ArrayList<>();
    static List<Hobby> linkList = new LinkedList<>();
    static Set<Hobby> hobbySet = new HashSet<>();
    static Map<Date, Hobby> hobbyMap = new HashMap<>();

    static Hobby[] arr = { new Football("football"),
                           new Basketball("basketball"),
                           new Fishing("fishing"), new Hobby(),
                           new Basketball("basketball") };

    static String[] defAsk = {  "1. ArrayList",
                                "2. LinkedList",
                                "3. HashSet",
                                "4. HashMap",
                                "5. Exit"       };

    static void work() throws Exception{

        for (int i = 0; i < defAsk.length; i++)
            System.out.println(defAsk[i]);

        compare();
    }

    static void compare() throws Exception {

        try{
            int store = sc.nextInt();
            switch (store) {
                case 1:
                    System.out.println("You've chosen 1. ArrayList");
                    addArrayList();
                    break;
                case 2:
                    System.out.println("You've chosen 2. LinkedList");
                    addlinkedList();
                    break;
                case 3:
                    System.out.println("You've chosen 3. HashSet");
                    addHobbySet();
                    break;
                case 4:
                    System.out.println("You've chosen 4. HashMap");
                    addHashMap();
                    break;
                case 5:
                    System.out.println("You've chosen 5. Exit");
                    System.exit(0);
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("You should enter a number !");
        }

    }

    static void addArrayList() {

        System.out.println("Array list before adding");
        printArray(arrList);
        System.out.println("----------------------------------------- \nArray list after adding: ");
        arrList.add(arr[0]);
        arrList.add(arr[1]);
        arrList.add(arr[2]);
        arrList.add(arr[3]);
        arrList.add(arr[4]);

        printArray(arrList);
        System.out.println("-----------------------------------------\nArray list after removing: ");

        for (int i = 3; i > 0; i--) {
            arrList.remove(i);
        }

        printArray(arrList);
    }

    static void printArray(List<Hobby> list) {
        for (Hobby item: list) {
            System.out.println(item);
        }
    }

    static void addlinkedList() {
        System.out.println("----------------------------------------- \nLinkedList before adding:");
        printArray(linkList);

        System.out.println("----------------------------------------- \nLinkedList after adding:");
        for (int i = 0; i < arr.length; i++) {
            linkList.add(i, arr[i]);
        }
        printArray(linkList);
    }

    static void addHobbySet() {
        System.out.println("----------------------------------------- \nHashSet before adding:");
        for (Hobby item: hobbySet) {
            System.out.println(item.hashCode());
        }

        System.out.println("----------------------------------------- \nHashSet after adding:");
        for (int i = 0; i < arr.length; i++) {
            hobbySet.add(arr[i]);
        }
        for (Hobby item: hobbySet) {
            System.out.println(item.hashCode());
        }
    }

    static void addHashMap() {
        System.out.println("----------------------------------------- \nHashMap before adding:");
        for (Map.Entry<Date, Hobby> items: hobbyMap.entrySet()) {
            System.out.println(items);
        }
        hobbyMap.put(new Date(), new Hobby());
        hobbyMap.put(new Date(111), new Basketball("basket"));
        hobbyMap.put(new Date(222), new Football("foot"));
        hobbyMap.put(new Date(365), new Fishing("fish"));
        hobbyMap.put(null, new Hobby());

        System.out.println("----------------------------------------- \nHashMap after adding:");
        for (Map.Entry<Date, Hobby> items: hobbyMap.entrySet()) {
            System.out.println("Key: " + items.getKey() + " " + "Value: " + items.getValue());
        }
    }
    public static void main(String[] args) throws Exception{
        while (true)
            work();
    }
}

