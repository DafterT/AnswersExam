package task_7;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        lists();
        // TODO сделать еще примеров
    }

    // Пример лямбды с листами
    public static void lists() {
        List<Integer> list = List.of(2, 3, 5, 7, 11, 13, 17);
        System.out.print("Elements in list: ");
        // Пройтись по всем элементам массива, используя лямбду
        list.forEach(it -> System.out.print(it + " "));
        System.out.print("\nElements more 7: ");
        // Фильтр, чтоб остались элементы > 7
        System.out.println(list.stream().filter(it -> it > 7).collect(Collectors.toList()));
        System.out.print("Multiply by 2: ");
        // Увеличить все элементы в 2 раза
        System.out.println(list.stream().map(it -> it * 2).collect(Collectors.toList()));
    }
}
