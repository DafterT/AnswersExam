package task_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        list();
        set();
    }

    // Несколько операций над листом
    static void list() {
        System.out.println("===========List test===========");
        List<Integer> list = new ArrayList<>(List.of(3, 1, 4, 1, 5));
        System.out.println("My list: " + list);
        System.out.println("Size of list: " + list.size());
        System.out.println("0 element in list: " + list.get(0));
        System.out.println("Sublist [1;3): " + list.subList(1, 3));
        System.out.println("Add 9 to end of list");
        list.add(9);
        System.out.println("My list: " + list);
        System.out.println("My list contains 9?: " + list.contains(9));
        System.out.println("Clear list");
        list.clear();
        System.out.println("My list: " + list);
        System.out.println("My list contains 9?: " + list.contains(9));
    }

    // Несколько операций над множеством
    static void set() {
        System.out.println("===========Set test===========");
        Set<Integer> set = new HashSet<>(List.of(3, 1, 4, 1, 5));
        System.out.println("My set: " + set);
        System.out.println("Size of set: " + set.size());
        System.out.println("My set contains 9?: " + set.contains(9));
        System.out.println("Add 9 to set");
        set.add(9);
        System.out.println("My set: " + set);
        System.out.println("My set contains 9?: " + set.contains(9));
    }
}
