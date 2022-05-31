package task_6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        list();
        set();
        map();
    }

    // Несколько операций над листом
    static void list() {
        System.out.println("===========List test===========");
        List<Integer> list = new ArrayList<>(List.of(3, 1, 4, 1, 5));
        System.out.println("My list: " + list); //My list: [3, 1, 4, 1, 5]
        System.out.println("Size of list: " + list.size()); //Size of list: 5
        System.out.println("0 element in list: " + list.get(0)); //0 element in list: 3
        System.out.println("Sublist [1;3): " + list.subList(1, 3)); //Sublist [1;3): [1, 4]
        System.out.println("Add 9 to end of list"); //Add 9 to end of list
        list.add(9);
        System.out.println("My list: " + list); //My list: [3, 1, 4, 1, 5, 9]
        System.out.println("My list contains 9?: " + list.contains(9)); //My list contains 9?: true
        System.out.println("Clear list");
        list.clear();
        System.out.println("My list: " + list); //My list: []
        System.out.println("My list contains 9?: " + list.contains(9)); //My list contains 9?: false
    }

    // Несколько операций над множеством
    static void set() {
        System.out.println("===========Set test===========");
        Set<Integer> set = new HashSet<>(List.of(3, 1, 4, 1, 5));
        System.out.println("My set: " + set); // My set: [1, 3, 4, 5]
        System.out.println("Size of set: " + set.size()); // Size of set: 4
        System.out.println("My set contains 9?: " + set.contains(9)); // My set contains 9?: false
        System.out.println("Add 9 to set");
        set.add(9);
        System.out.println("My set: " + set); // My set: [1, 3, 4, 5, 9]
        System.out.println("My set contains 9?: " + set.contains(9)); // My set contains 9?: true
    }

    // Несколько операций над множеством
    static void map() {
        System.out.println("===========Map test===========");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println("My map: " + map); // My map: {1=One, 2=Two}
        System.out.println("Size of map: " + map.size()); // Size of map: 2
        System.out.println("Which corresponds to 9 in my map?: " + map.get(9)); // Which corresponds to 9 in my map?: null
        System.out.println("Add 9 to map");
        map.put(9, "Nine");
        System.out.println("My map: " + map); // My map: {1=One, 2=Two, 9=Nine}
        System.out.println("Which corresponds to 9 in my map?: " + map.get(9)); // Which corresponds to 9 in my map?: Nine
    }
}
